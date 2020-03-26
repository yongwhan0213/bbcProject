/**
 * 차량예약관련 스크립트 파일
 */
// 대여일 및 반납일 지정 
// 전역변수 선언
var rent_branch;		// 대여지점 코드
var return_branch;		// 반납지점 코드
var rent_branchnm;		// 대여지짐 이름
var return_branchnm;	// 반납지점 이름
var carType;			// 차량유형
var rentDate;			// 대여일시
var returndate;			// 반납일시

$(function() {
		
	// 대여일시 반납일시 선택
	var d = new Date();
	d.setHours(10);
	d.setMinutes(00);
	d.setSeconds(00);
			
  	$('#selectDate').daterangepicker({
  		autoUpdateInput: false,
      	timePicker: true,    
      	timePicker24Hour: true,
      	timePickerIncrement: 30,
      	startDate: d,
      	endDate: d,
      	locale: {
        	format: 'YYYY-MM-DD HH:mm',
        	separator: ' ~ ',
        	applyLabel: '확인',
        	cancelLabel: '취소'                                      
      	}
  	});
  	
  	$('#selectDate').on('apply.daterangepicker', function(ev, picker) { 
  		$('input[name="reservation_date"]').val(picker.startDate.format('YYYY-MM-DD HH:mm')); 
      	$('input[name="return_date"]').val(picker.endDate.format('YYYY-MM-DD HH:mm')); 
      	rentDate = picker.startDate.format('YYYY-MM-DD HH:mm');
      	returnDate = picker.endDate.format('YYYY-MM-DD HH:mm');
	});
  	
  	//$('#selectDate').on('cancel.daterangepicker', function(ev, picker) {	  	
	//
  	//});
  	
  	// 대여일시/대여지점/차종 선택 후 검색 클릭시 오른쪽에 검색결과가 보여지도록 처리
  	$('#serchCar').click(function () { 
  		serachCarList();  		
  	}); 
  	   	
  	// 페이지로드시 기본으로 선택된 지점리스트 조회
  	if($('#brancharea').val() != "") {  
  		displayBranchList($('#brancharea').val())
  	}  	
  	
  	// 지역선택시 선택된 지역의 지점리스트 조회
  	$('#brancharea').on('change', function() {
  		displayBranchList($(this).val())
  	});
  	  	  	
  	// 지점 이벤트 클릭시 수행
  	$('#eventInfo').on('show.bs.modal', function (event) {
  		var rTarget = $(event.relatedTarget)
  		var eventData = rTarget.data('whatever')
  		var eventItem = ""	  		
  	    	
  		var modal = $(this)
  		// 지금까지 이런 이벤트는 없었다. 최대 90% 할인^2020-03-01^2020-03-31^90$3월 봄내음 나는 Big Event! 전차종 최대 55% 할인^2020-03-01^2020-03-31^55$
  		var arrEvent = eventData.split("$");  		
  		$.each(arrEvent, function(index, item){
  			if(index <arrEvent.length-1) {
  				var arrEventItem = item.split("^");
  				eventItem += "<li class='check f14'>"
  				$.each(arrEventItem, function(index, item){ 			
  						if(index == 1) {
  							eventItem += "- 기간 : " + item + " ~ "
  						}else if(index == 3) {
  							eventItem += "- 할인율 : " + item + "%"
  						}else {
  							eventItem += item + "<br>"
  						}  				
  				}); 
  				eventItem += "</li>"
  			}		
  		});
  	  	    		
  		modal.find('.modal-body ul').html(eventItem)
 
  	});
  	
  	// 지점 공지사항 클릭시 수행
  	$('#noticeInfo').on('show.bs.modal', function (event) {
  		var rTarget = $(event.relatedTarget)
  		var noticeData = rTarget.data('whatever')
  		var noticeItem = ""
  		console.log(noticeData);	
  		
  		var modal = $(this)	
  		
  		var arrNotice = noticeData.split("^");
  		
  		noticeItem += "<li class='f14 fontwt-bold'>" + arrNotice[0] + "</li>"
  		noticeItem += "<li class='hg-15'><li>"
  		noticeItem += "<li class='f14'>" + arrNotice[1] + "</li>"
  		
  		modal.find('.modal-body ul').html(noticeItem)
  		
  	});
  	
  	// 차량유형 가져오는 함수 호출
  	displayCarInfo();
   	
});



	
// 지점선택(라디오버튼)시 rent_branch, return_branch 변수에 값 셋팅	
function setRentBranch(target) {
	targetValue = target.value;
	targetId = $(target).attr('returnid');
	rent_branch = targetValue.split('^')[0];
	rent_branchnm = targetValue.split('^')[1];	

	if($('input[name="return_option"]').is(":checked")) {	
		$("#" + targetId).attr('checked', true);
		return_branch = targetValue.split('^')[0];
		return_branchnm = targetValue.split('^')[1];		
	}	
	
}	

function setReturnBranch(target) {	
	targetValue = target.value;
	targetId = $(target).attr('returnid');
	return_branch = targetValue.split('^')[0];
	return_branchnm = targetValue.split('^')[1];	

	if($('input[name="return_option"]').is(":checked")) {	
		$("#" + targetId).attr('checked', true);
		rent_branch = targetValue.split('^')[0];
		rent_branchnm = targetValue.split('^')[1];		
	}		
}

// 지점선택 후 확인 클릭시 수행
function setBranch() {
	if(rent_branchnm == "") {
		alert("대여지점을 선택해 주세요");
		return false;
	}else if(return_branchnm == ""){
		alert("반납지점을 선택해 주세요");
		return false;
	}else{
		$('input[name="rent_branch"]').val(rent_branchnm);
		$('input[name="return_branch"]').val(return_branchnm);
	}
}
	

// 이전/다음 클릭시 페이지 이동
function goLinkPage(pageName) {
	location.href = pageName;	
}

// 예약버튼 클릭시 수행
function goOptionPage(obj) {
	
	//pageName = contextJSPath + "/carOption.rv";
	
	var rent_branch			// 대여지점 토
	var return_branch 		// 반납지점코드
	var rent_branchnm		// 대여지점  
	var return_branchnm		// 반납지점
	var rentDate			// 대여일시
	var returndate			// 반납일시
	var carname				// 차명 
	var carimg				// 차이미지
	var carpay				// 대여금액(기본)

	
	$.ajax({
		url:"/carOption.rv",
		data:{name:name, 
			  age:age},
		type:"POST",
		success:function(result){
			console.log("ajax 통신 성공!!");	
		},
		error:function(){
			console.log("ajax 통신 실패!!");
		}
	});

}

// 지점선택시 지역선택에 따른 지점리스트 표시
function displayBranchList(areaNo) {
	$.ajax({
  		url:"reservationBrSearch.rv?areano=" + areaNo,
  		type:"get",
  		success:function(list){  
  			var rentValue = "";  	
  			var returnValue = "";
  			var eventInfo; 
  			var noticeInfo;
  			for(var i=0; i<list.length; i++) {    				
  				// 선택한 지점의 이벤트리스트가 있는 경우 이벤트 아이콘 표시	
  				eventInfo = "";
  				eventItem = "";
  				if(list[i].eventContent != "") {
  						eventInfo = "<a data-toggle='modal' href='#eventInfo' data-whatever='" + list[i].eventContent + "'>" +
  						"<img src='resources/images/btn_event.png'></a>";				
				}
  				
  				// 선택한 지점의 공지사항 표시
  				noticeInfo = ""
  				if(list[i].noticeContent != "") {
  					noticeInfo = "<a data-toggle='modal' href='#noticeInfo' data-whatever='" + list[i].noticeContent + "'>" +
  							"<img src='resources/images/btn_notice.png'></a>";		
				}
  				rentValue += "<li>" +
  					 "<input type='radio' id='lrdo-" + list[i].branchNo + "' returnid=rrdo-" + list[i].branchNo +
  					 " class='radio-branch' name='rdo-br" + 
  					 "' value='" + list[i].branchNo + "^" + list[i].branchName +
  					 "' onclick='setRentBranch(this)'>" + 
  					 " <label for='rdo-" + list[i].branchNo + "'>" +
  					 list[i].branchName + "</label>" + eventInfo + noticeInfo + 
  					 "<a data-toggle='modal' href='#branchInfo' data-backdrop='static' class='libtn btn-white'>지점안내</a>" +
  					 "</li>"
  	  			returnValue += "<li>" +
 					 "<input type='radio' id='rrdo-" + list[i].branchNo + "' returnid=lrdo-" + list[i].branchNo +
 					 " class='radio-branch' name='trdo-br" + 
 					 "' value='" + list[i].branchNo + "^" + list[i].branchName +
 					 "' onclick='setReturnBranch(this)'>" + 
 					 " <label for='trdo-" + list[i].branchNo + "'>" +
 					 list[i].branchName + "</label>" + eventInfo + noticeInfo + 
 					 "<a data-toggle='modal' href='#branchInfo' data-backdrop='static' class='libtn btn-white'>지점안내</a>" +
 					 "</li>" 					 
  			}  	  	
  				
  			$("#selRentDiv ul").html(rentValue);
  			$("#selReturnDiv ul").html(returnValue);
  				
  		},
  		error:function(){
  			console.log("지점리스트 가져오는 ajax 통신 오류");
  		}
	});  	
}

// 차량유형 리스트 표시
function displayCarInfo() {
	
	$.ajax({
  		url:"rvCarInfoSearch.rv",
  		type:"get",
  		success:function(list){  
  			var listcnt = 0;
  			var carInfoValue = "<table>"
  			for(var i=0; i<list.length; i++) {  
  				
  				if(listcnt==0) {
   					carInfoValue += "<tr>"
  				}	
  				carInfoValue += "<td ctype='" + 
					list[i].carTypeNo + "'cname='" + 
					list[i].carTypeName + "' rentP1='" + 
					list[i].rent1D + "' rentP2='" + 
					list[i].rent1D6D + "' rentP3='" +
					list[i].rent7DP + "' memberP='" +
					list[i].memberCar + "' onclick='setCarType(this)'>" + 
					list[i].carTypeName + "</td>"
	  			if(listcnt==2 || i==list.length-1) {	  				
	  				carInfoValue += "</tr>"
	  				listcnt = 0
	  			}else{
	  				listcnt++
	  			}
  			}
  			carInfoValue += "<tr><td ctype='all' onclick='setCarType(this)'>전체보기</td>"
  			carInfoValue += "<td colspan='2' ctype='memberp' onclick='setCarType(this)'>알뜰카(회원전용)</td></tr>"
  			carInfoValue += "</table>" 		
  			$("#car-type-list").html(carInfoValue);
  			
  		},
  		error:function(){
  			console.log("차량유형 가져오는 ajax 통신 오류");
  		}
	});
	
}

// 선택한 차량유형값 변수에 셋팅
function setCarType(target) {	
	carType = $(target).attr('ctype');
	$("#car-type-list > table > tbody > tr > td").removeAttr("style");
	$(target).css("color", "red");
	
	/*
	if(carType != "all" && carType != "memberp") {
		carTypeName = $(target).attr('cname');
		rentPay1 = $(target).attr('rentP1');	// 1일 대여료
		rentPay2 = $(target).attr('rentP2');	// 3~6일 대여료
		rentPay3 = $(target).attr('rentP3');	// 7일이상 대여료
		rentPay4 = $(target).attr('memberP');	// 알뜰카 대여료
	}
	*/
	
}

function serachCarList(){
		var rent_date = $('input[name="reservation_date"]').val();
  		var return_date = $('input[name="return_date"]').val();
  		if(rent_date == "대여일시" || return_date == "반납일시") {
  			alert("대여일시 및 반납일시를 선택해 주세요");
  			return;  	
  		}else if(typeof rent_branch === "undefined") {
  			alert("대여지점 및 반납지점을 선택해 주세요");
  			return;
		}else if(typeof carType == "undefined") {
  			alert("차량유형을 선택해 주세요");
  			return;
		}	
  		
  		$.ajax({
  	  		url:"rvSearchCar.rv?carType=" + carType + "&rent_branch=" + rent_branch + "&rent_date=" + rent_date + "&return_date=" + return_date,
  	  		type:"get",
  	  		success:function(list){  
  	  			console.log(list);
  	  			
  	  			var resultValue = "<table style='width:470px'>"
  	    		for(var i=0; i<list.length; i++) {    	    		
  	    			resultValue += "<tr>"
  	    			resultValue += "<td rowspan='3'><img width='125px' height='85px' src='" + contextJSPath + "/resources/carinfo_upfile/" + list[i].CAR_MODIFY_NAME + "'></td>"
  	    			resultValue += "</tr>"
  	    			resultValue += "<tr>"
  	    			resultValue += "<td width='70%' class='car-type'>" + list[i].CAR_TYPE_NAME + "</td>"
  	    			resultValue += "<td width='30%' class='car-price'>" + numberFormat(list[i].PRICE) + "원</td>"
  	    			resultValue += "</tr>"
  	    			resultValue += "<tr>"
  	    			resultValue += "<td colspan='2'>"
  	    			resultValue += "<span class='ico-gas'><img src='" + contextJSPath + "/resources/images/car/" + list[i].FUEL_IMG + "'></span>"
  	    			resultValue += "<div class='ico-people-wrap'>"
  	    			resultValue += "<div><img src='" + contextJSPath + "/resources/images/car/ico_people.png'></div>"
  	    			resultValue += "<div class='ico-people-text'><p class='ico-people-count'>" + list[i].CAR_RIDE_PEOPLE + "</p></div>"
  	    			resultValue += "</div>"					
  	    			resultValue += "<div class='btn-reservation' carname='" + list[i].CAR_TYPE_NAME + "' " 
  	    			resultValue += "carimg='" + list[i].CAR_MODIFY_NAME + "' "
  	    			resultValue += "carpay='" + numberFormat(list[i].PRICE) + "' onclick='goOptionPage(this);'>예약</div>"				
  	    			resultValue += "</td>"				
  	    			resultValue += "</tr>"
  	    			resultValue += "<tr>"
  	    			resultValue += "<td colspan='3'><p style='border-bottom: 1px solid #757272; margin-top:10px; margin-bottom:5px;'></p></td>"
  	    			resultValue += "</tr>"
  	    		}
  	  			resultValue += "</table>";
  	  			
  	  			console.log(resultValue);
  	  			$("#searchcnt").html("결과<span>(" + list.length + ")</span>");
  	  			$(".list-car").html(resultValue);
  	  			$('#car-info-right').css("display", "none");   
  	  			$('#car-search-result').css("display", "block");    	  		  	  		
  	  		},
  	  		error:function(){
  	  			console.log("차량유형 가져오는 ajax 통신 오류");
  	  		}
  		});
}

// 천 단위마다 컴마 찍기
function numberFormat(inputNumber) {
	return inputNumber.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}






