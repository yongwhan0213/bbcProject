<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 내역 조회</title>
<style>
    .outer{
		width:860px;
		margin-left:auto;
		margin-right:auto;
	}	

    .main-title{
		margin-top: 35px; 
		font-size: 20px;
		font-weight: 900;
	}	
	hr.garo{
		border: 1px solid #757272;
		margin: 17px 0px 0px 0px;
	}	

    #tableMain{
        width:860px;
        border:1px solid lightgray;
        border-left: none;
        border-right: none;
        border-collapse: separate;
        border-spacing:0px;
        margin-top:40px;
        text-align: center;
    }

    table{
        width: 100%;
    }
    th{
        margin-top: 10px;
        background: lightgray;
        box-sizing: border-box;
    }

    th,td {
       
         text-align: center;
         border: 1px solid lightgray;
         border-left: none ;
         border-right: none;
    }


    #pop{
        border: 1px solid lightgray;
        font-size: 10px;
        text-align:left
    }
    
    #tableMain > img{
    	 display:block;
    	 width: 70px; 
    	 height: 40px;
    
    }

   

    #bor{
        border: 1px solid gray;
        text-align: center;
        font-weight: bold;
        height:40px;
    }

    .pay{
        text-align: left;
        font-weight: bold;
        background-color: rgba(211, 211, 211, 0.418);
    }

    .breakrow{
        border: 1px solid lightgray;
        margin-top:10px;
        margin-bottom:10px;
    
    }

    input{
        background-color: #ffc107;
        color:white;
        border-radius: 2px;

    }

    #sep{
        border: 1px solid gray; 
        border-collapse: collapse;

    }
    
    #space{
        margin-left: 20px;
      	width:60;
      	height:25px;
      	text-align:center;
      	margin-top:5px;
      	margin-bottom:5px;
      	color:white;
      	font-size:10px;
    }



    .arrow {
            float: left;
            border: 10px solid transparent;
            margin-top: 10px;
            margin-left: 20px;
            border-top-color: lightgray;
            transition: 350ms;
            position: absolute;
    }
    .accordion-head.open{
            background: white;
    }
    .accordion-head.open1{
            background: #eee;
    }
    .accordion-head.open .arrow {
 
         
            
    }
    
    
	.pagination {
	  display: inline-block;
	  margin: 20px 0;
	  border-radius: 4px;
	  margin-left: 260px;
	  margin-top: 60px;
	  text-align:center;
	}
	.pagination a {
	    color: black;
	    float: left;
	    padding: 8px 12px;
	    text-decoration: none;
	    transition: background-color .3s;
	    border: 1px solid #e2e2e2;
	    margin: 0 8px 2px 2px;
	}
	.pagination > li {
	  display: inline;
	}
	.pagination > li > a,
	.pagination > li > span {
	  position: relative;
	  float: left;
	  padding: 6px 12px;
	  margin-left: -1px;
	  line-height: 1.42857143;
	  color: #337ab7;
	  text-decoration: none;
	  background-color: #fff;
	  border: 1px solid #ddd;
	}
	.pagination > li:first-child > a,
	.pagination > li:first-child > span {
	  margin-left: 0;
	  border-top-left-radius: 4px;
	  border-bottom-left-radius: 4px;
	}
	.pagination > li:last-child > a,
	.pagination > li:last-child > span {
	  border-top-right-radius: 4px;
	  border-bottom-right-radius: 4px;
	}
	.pagination > li > a:hover,
	.pagination > li > span:hover,
	.pagination > li > a:focus,
	.pagination > li > span:focus {
	  color: #23527c;
	  background-color: #eee;
	  border-color: #ddd;
	}
	.pagination > .active > a,
	.pagination > .active > span,
	.pagination > .active > a:hover,
	.pagination > .active > span:hover,
	.pagination > .active > a:focus,
	.pagination > .active > span:focus {
	  z-index: 2;
	  color: #fff;
	  cursor: default;
	  background-color: #337ab7;
	  border-color: #337ab7;
	}
	.pagination > .disabled > span,
	.pagination > .disabled > span:hover,
	.pagination > .disabled > span:focus,
	.pagination > .disabled > a,
	.pagination > .disabled > a:hover,
	.pagination > .disabled > a:focus {
	  color: #777;
	  cursor: not-allowed;
	  background-color: #fff;
	  border-color: #ddd;
	}
	.pagination-lg > li > a,
	.pagination-lg > li > span {
	  padding: 10px 16px;
	  font-size: 18px;
	}
	.pagination-lg > li:first-child > a,
	.pagination-lg > li:first-child > span {
	  border-top-left-radius: 6px;
	  border-bottom-left-radius: 6px;
	}
	.pagination-lg > li:last-child > a,
	.pagination-lg > li:last-child > span {
	  border-top-right-radius: 6px;
	  border-bottom-right-radius: 6px;
	}
	.pagination-sm > li > a,
	.pagination-sm > li > span {
	  padding: 5px 10px;
	  font-size: 12px;
	}
	.pagination-sm > li:first-child > a,
	.pagination-sm > li:first-child > span {
	  border-top-left-radius: 3px;
	  border-bottom-left-radius: 3px;
	}
	.pagination-sm > li:last-child > a,
	.pagination-sm > li:last-child > span {
	  border-top-right-radius: 3px;
	  border-bottom-right-radius: 3px;
	}
    
    </style>
    
        
    </head>
    <body>
    
    
    <%@ include file="../common/menubar.jsp" %>
    
        <div class="outer"> 
            <span class="main-title">예약 내역 조회</span>
            <hr class="garo">
  
  	<!--  테이블 -->
            <table id="tableMain" class="accordion" style="text-align:center;">
                    <thead>
                        <tr>
                          <th style="height:40px;">예약 번호</th>
                          <th style="height:40px;">대여 기간</th>
                          <th style="height:40px; padding-right:90px;">지점명</th>
                        </tr>
                    </thead>
                    <tbody>
     
      <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
         <!-- 테이블 정보 -->
      <tr class="accordion-head breakrow open">
        <td><div class="arrow"></div> 1</td>
        <td>2020.02.05 ~ 2020.02.07</td>
        <td>강남지점-강남지점 <input id="space" type="button" value="예약 취소" onclick="cancelRes();"></td>
      </tr>
      <tr class="accordion-body" style="display: none;">
        <td colspan="3">
          <table id="sep">
            <tbody>
              <tr id="pop">
                <td id="bor" rowspan="5" style="width: 302px;" ><img src="http://www.cctoday.co.kr/news/photo/201509/925979_306258_1646.jpg" style="width:400px"></td>
              	
							 <tr id="pop">
							 <td id="bor" >보험료</td>
							  <td style="border:1px solid gray" >25,800원 </td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">대여료</td>
							  <td style="border:1px solid gray" colspan="2">25,800원 </td>
							  </tr>
							  <tr id="pop" >
							<td id="bor" >쿠폰/이벤트</td>
							<td style="border:1px solid gray" colspan="2">52,520원</td>
							
							</tr>
							 <tr id="pop">
							  <td id="bor">총 결제금액 </td>
							  <td style="border:1px solid gray" colspan="2"> 150,000원 </td>
							
							<tr id="pop">
                <td id="bor" colspan="2">결제 일시</td>
               
                <td style="border:1px solid gray" colspan="2">2018.01.24</td>
                 <tr id="pop">
                <td id="bor" colspan="2">결제 금액</td>
                <td style="border:1px solid gray" colspan="2">52,520원</td> 
              </tr>
              <tr id="pop">
                <td id="bor" colspan="2">결제 방식</td>
                <td style="border:1px solid gray" colspan="2" >신용카드</td>
              </tr>
              <tr id="pop">
                <td  style="border:1px solid gray" id="bor"colspan="2">환불 여부</td>
                <td  colspan="2" style="border:1px solid gray"  >진행중</td>
              </tr>
               <tr id="pop">
                <td style="border:1px solid gray"  colspan="2" id="bor">환불 일시</td>
                <td style="border:1px solid gray"  colspan="2">2018.02.04</td>
              </tr>
              </tr>
      
                      
              
           
            </tbody>
          </table>
        </td>
      </tr>
      
     
    <!-- 테이블 정보 끝  -->
    
                        
           </tbody>
          </table>
          
          <!-- 테이블 끝 -->
          
          
          
             <div class="pagination" style="padding-left:250px; margin-top:60px;">
                <a href="#">«</a>
                <a href="#">&lt;</a>
                <li><a href="#home">1</a></li>
                <li><a href="#home">2</a></li>
                <li><a href="#home">3</a></li>
                <li><a href="#home">4</a></li>
                <li><a href="#home">5</a></li>
                <a href="#">&gt;</a>
                <a href="#">»</a>
            </div>
            
            
    </div>
    <script>


    $(document).on('click', '.accordion-head', function(){


    $('.accordion-head').removeClass('open');
    if (!$(this).hasClass('open')){
      $(this).addClass('open1'); 
    }
    else{ 
      $('.accordion-head').removeClass('open'); 
      $(this).addClass('close'); 
    }
    $('.accordion-body').slideUp("fast");
    $(this).next().slideDown("fast"); 

    $(document).on('dblclick', '.accordion-head', function(){
        
      if (!$(this).hasClass('open')){
          $('.accordion-head').removeClass('open1');
    }
    else{
      $('.accordion-head').removeClass('open'); 
      $(this).addClass('close'); 
    }
    $('.accordion-body').slideUp("fast");
    });
    });
            
    </script>
    
    <script>
   
    function cancelRes() {
      alert("예약이 취소되었습니다.");
    }

    </script>
          
</body>
</html>
