<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>나의 지점</title>
<style>
.outer{
		width:860px;
		margin-left:auto;
		margin-right:auto;
	}	
	
hr.garo{
		border: 1px solid #757272;
		margin: -6px 0px 0px 0px;
	}	
	
.main-title{
		margin-top: 35px; 
		font-size: 20px;
		font-weight: 900;
	}	
	
	 .search{
        background: #ffc107;
        color:white;
        width: 80px;
        height: 20px;
        border-radius: 4px;
        float:right;
        text-align:center;
        margin-top: -10%;
        margin-right: 20px;
    }
   	table{
   		margin-top:17px;
   	}

   	img{
   		width: 100px;
   		height:100px;
   	}
   	#branchInfo{
   		border: 2px solid lightgray;
   		text-align:left;
   		padding: 10px 10px 10px 10px;
   	}
   	.bran{
   		background-color: lightgray;
   		text-align:center !important;
   	}
</style>
</head>
<body>

<%@ include file="../common/menubar.jsp" %>
	

		<div class="outer"> 
		     <div class="main-title">나의지점</div>
		     
			<!--나의 지점 등록 -->	     	
            <div class="popup" > 
            <div class="container" style="margin-bottom:7px;margin-left:15px;">
                <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal" style="float:right;background: #ffc107;height:20px;font-size:10px;width:90px;padding-top:2px;">지점 등록</button>
              	
				  <!-- Modal -->
				  <div class="modal fade" id="myModal" role="dialog">
				    <div class="modal-dialog modal-sm">
				      <div class="modal-content" style="margin-top:200px;">
				        <div class="modal-header">
				          <button type="button" class="close" data-dismiss="modal">&times;</button>
				          <h4 class="modal-title" style="font-size:20px;"><strong>지점찾기</strong></h4>
				        </div>
				        
				    <!-- 모달 지역명: -->
				        <div class="modal-body" style="height:310px;">
				          <strong>지역명:</strong> <table style="border:1px solid lightgray;width:100%;text-align:center;left-margin:10px;bottom-margin:10px">
				          <tr  style="border:1px solid lightgray;">
							 <td  style="border:1px solid lightgray;">서울</td>
							 <td  style="border:1px solid lightgray;">인천/경기</td>
							 <td  style="border:1px solid lightgray;">강원</td>
						 </tr>
						 <tr  style="border:1px solid black;">
							 <td  style="border:1px solid lightgray;">충청/세종</td>
							 <td  style="border:1px solid lightgray;">전라/광주</td>
							 <td  style="border:1px solid lightgray;">경상/대구</td>
					    </tr>
						<tr  style="border:1px solid black;">
							 <td  style="border:1px solid lightgray;">부산/울산</td>
							 <td  style="border:1px solid lightgray;">제주</td>
							 <td  style="border:1px solid lightgray;">대전</td>
					    </tr>	 			          				
				          </table>
				          <br>
				          <!-- 모달 구명: -->
				            <strong>구(명):</strong> <table style="border:1px solid lightgray;width:100%;text-align:center;left-margin:10px;">
				          <tr  style="border:1px solid lightgray;">
							 <td  style="border:1px solid lightgray;">부천</td>
							 <td  style="border:1px solid lightgray;">분당</td>
							 <td  style="border:1px solid lightgray;">수원역</td>
						 </tr>
						 <tr  style="border:1px solid black;">
							 <td  style="border:1px solid lightgray;">안양</td>
							 <td  style="border:1px solid lightgray;">수원</td>
							 <td  style="border:1px solid lightgray;">인천</td>
					    </tr>
						<tr  style="border:1px solid black;">
							 <td  style="border:1px solid lightgray;">오산</td>
							 <td  style="border:1px solid lightgray;">의정부</td>
							 <td  style="border:1px solid lightgray;">일산</td>
					    </tr>	 			          				
				          </table>
				        </div>
				        <div class="modal-footer">
				          <button type="button" class="btn btn-default" data-dismiss="modal" style="background: #ffc107;color:white;text-align:center;margin-right:85px;">지점등록</button>
				        </div>
				      </div>
				    </div>
				  </div>
				</div>
              </div>
              
              <!-- 모달 끝 -->
			<hr class="garo"> 
		
			<!-- 나의 지점 등록 끝 -->
		<table>
			<tr>
				<td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSnnJncNl4iwO2L7Hx8uavjI4IID2Mej3AMhUro2uivPjOIeBYH"></td>
				<td style="padding-left:40px;"><b>지점명:</b></td>
				<td style="padding-left:10px;">서울</td>
				<td style="padding-left:40px;"><b>(구)명:</b></td>
				<td style="padding-left:10px;">강남구</td>
				<td style="padding-left:40px;"><b>전화번호:</b></td>
				<td style="padding-left:10px;">02-832-0329</td>
				
				
				
				<td style="padding-left:50px;">
				
			 <div class="container" >
                <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal3" style="background: #ffc107;height: 30px;width: 78px;"></button>
              	
				  <!-- Modal 로그인 -->
				  <div class="modal fade" id="myModal3" role="dialog">
				    <div class="modal-dialog modal-sm">
				      <div class="modal-content" style="margin-top:200px; width:350px;">
			 
				    <!-- 로그인  -->
				        <div class="modal-body" style="height:500px; width:300px; padding:0px 0px 0px 0px;">
				         
							<%@ include file="../mypage/login.jsp" %>
	
				        </div>
				      </div>
				    </div>
				  </div>
				</div>
		
		
</div>

</body>
</html>