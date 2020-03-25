<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.table{margin-left: 3rem;}
	#searchBtn {
	    color: white;
	    background-color: orange;
	    margin-left: 1rem;
	    width: 65px;
	}
	.enrollBtn{
		border-radius: 5px;
	    outline: 0;
	    border: 0;
	    background-color: orange;
	    color: white;
	    width: 60px;
	    height: 35px;
	    margin-bottom: 0.75rem;
	}
	.deleteBtn{
		border-radius: 5px;
	    outline: 0;
	    border: 0;
	    background-color: rgba(90, 92, 105, 0.5);
	    color: white;
	    width: 60px;
	    height: 35px;
	    margin-bottom: 0.75rem;
	}
	.btnList {
	    text-align: end;
	    margin-left: 6.5rem;
	    width: 1110px;
	}
	
	
	/* 민진 한테 받은 search 스타일 부분 */
	.navbar-form {
	  margin-top: 2rem;
	  margin-left: 20rem;
	  margin-right: 13rem;
	}
	.navbar-search .dropdown-menu { min-width: 10px;}
	#searching {
	  color: white;
	  background-color: orange;
	  margin-left: 1rem;
	}
	.pagination {
	  display: flex;
	  padding-left: 0;
	  list-style: none;
	  border-radius: 0.35rem;
	  margin-left: 24rem;
	  margin-bottom: 5rem;
	}
	button.btn.btn-search.dropdown-toggle {
	    background: transparent;
	    color: black;
	}
	.btn-toolbar .input-group {
	  width: auto;
	}
	.input-group {
	  position: relative;
	  display: flex;
	  flex-wrap: wrap;
	  align-items: stretch;
	  width: 100%;
	  margin-bottom: 3rem;
	}	
	.dropdown-menu {
	  position: absolute;
	  top: 100%;
	  left: 0;
	  z-index: 1000;
	  display: none;
	  float: left;
	  min-width: 10rem;
	  padding: 0.5rem 0;
	  margin: 0.125rem 0 0;
	  font-size: 0.85rem;
	  color: #858796;
	  text-align: left;
	  list-style: none;
	  background-color: #fff;
	  background-clip: padding-box;
	  border: 1px solid #e3e6f0;
	  border-radius: 0.35rem;
	}
	.dropleft .dropdown-menu {
	  top: 0;
	  right: 100%;
	  left: auto;
	  margin-top: 0;
	  margin-right: 0.125rem;
	}
	.dropup .dropdown-menu {
	  top: auto;
	  bottom: 100%;
	  margin-top: 0;
	  margin-bottom: 0.125rem;
	}
	.dropright .dropdown-menu {
	  top: 0;
	  right: auto;
	  left: 100%;
	  margin-top: 0;
	  margin-left: 0.125rem;
	}
	.dropright .dropdown-toggle::after {
	  display: inline-block;
	  margin-left: 0.255em;
	  vertical-align: 0.255em;
	  content: "";
	  border-top: 0.3em solid transparent;
	  border-right: 0;
	  border-bottom: 0.3em solid transparent;
	  border-left: 0.3em solid;
	}
	.dropright .dropdown-toggle:empty::after {
	  margin-left: 0;
	}
	.dropright .dropdown-toggle::after {
	  vertical-align: 0;
	}	
	
	
	/* 모달 스타일 */
	/* 기본 틀 스타일 */
	.modal-footer {display: table-cell !important;}
	button.completeBtn {
	    position: relative;
	    border-radius: 5px;
	    outline: 0;
	    border: 0;
	    background-color: orange;
	    color: white;
	    width: 60px;
	    height: 35px;
	    margin-bottom: 0.75rem;
	}
	button.cancelBtn{
		border-radius: 5px;
	    outline: 0;
	    border: 0;
	    background-color: rgba(90, 92, 105, 0.5);
	    color: white;
	    width: 60px;
	    height: 35px;
	    margin-bottom: 0.75rem;
	}
	
	/* 여기서부턴 페이지마다 조금씩 다름 */
	#userInfoHeader>h5{font-weight:bold;}
	div#userInfoHeader {
	    text-align: left;
	    margin: 0 0 20px 20px;
	}
	.modal-body td {
	    margin-left: 40px;
	    float: left;
	}
	table#userInfo-table {
	    margin-left: 3rem;
	}
	
</style>
</head>
<body>
	<%@ include file="../common/adminBase.jsp" %>
	
	<!-- 정지회원조회 시작 -->
	<div class="outer">
		
		<div class="faq-header">
			<h1>정지회원조회</h1>
		</div>
		<hr id="header-line">
		<br>
		
    	<!-- 블랙회원 상세 조회 Modal -->
		<div class="modal fade" id="blackUserInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      
		      <div class="modal-body">
		      	<br>
				<div id="userInfoHeader"><h5>회원 정보</h5></div>	
				<hr>      	
		      	<table id="userInfo-table">
					<tr>
						<th>이름</th>
						<td>김민기</td>
					</tr>
					<tr>
						<th>회원 아이디</th>
						<td>admin</td>
					</tr>
					<tr>
						<th>회원 비밀번호</th>
						<td>admin123</td>
					</tr>
					<tr>
						<th>주소</th>
						<td>서울특별시 강동구 천호동 111-11
					</tr>
					<tr>
						<th>연락처</th>
						<td>010-3806-7661</td>
					</tr>
					<tr>
						<th>이메일</th>
						<td>duddjdkdlel1728@gmail.com</td>
					</tr>
					<tr>
						<th>성별</th>
						<td>남</td>
					</tr>
					<tr>
						<th>가입일</th>
						<td>2020-03-15</td>
					</tr>
					<tr>
						<th>회원상태</th>
						<td>정지</td>
					</tr>
					<tr>
						<th>정지사유</th>
						<td>욕설</td>
					</tr>
					
		      	</table>
		      </div>
		      
		      <div style="display:none;"></div>
		      
		      <div class="modal-footer">
		      	<button type="button" class="completeBtn" onclick="deleteBlack();">해제</button>
		        <button type="button" class="cancelBtn" data-dismiss="modal">취소</button>
		      </div>
		    </div>
		  </div>
		</div>
		
    	<!-- 탈퇴회원 상세 조회 Modal -->
		<div class="modal fade" id="falseUserInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      
		      <div class="modal-body">
		      	<br>
				<div id="userInfoHeader"><h5>회원 정보</h5></div>	
				<hr>      	
		      	<table id="userInfo-table">
					<tr>
						<th>이름</th>
						<td>김민기</td>
					</tr>
					<tr>
						<th>회원 아이디</th>
						<td>admin</td>
					</tr>
					<tr>
						<th>회원 비밀번호</th>
						<td>admin123</td>
					</tr>
					<tr>
						<th>주소</th>
						<td>서울특별시 강동구 천호동 111-11
					</tr>
					<tr>
						<th>연락처</th>
						<td>010-3806-7661</td>
					</tr>
					<tr>
						<th>이메일</th>
						<td>duddjdkdlel1728@gmail.com</td>
					</tr>
					<tr>
						<th>성별</th>
						<td>남</td>
					</tr>
					<tr>
						<th>가입일</th>
						<td>2020-03-15</td>
					</tr>
					<tr>
						<th>회원상태</th>
						<td>정지</td>
					</tr>
					<tr>
						<th>탈퇴사유</th>
						<td>서비스 만족도 불만</td>
					</tr>
					
		      	</table>
		      </div>
		      
		      <div style="display:none;"></div>
		      
		      <div class="modal-footer">
		      	<button type="button" class="completeBtn" data-dismiss="modal">확인</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		
		<div class="tab-content">
		  <div id="home" class="container tab-pane active"><br>
		    
		    <table id="notice-table" class="table table-bordered" >
		      <thead>
		        <tr>
		            <th><input type="checkbox" name="checkAll" id="th_checkAll" onclick="checkAll();"></th>
		            <th>회원번호</th>
		            <th>회원ID</th>
		            <th>회원이름</th>
		            <th>주소</th>
		            <th>상태</th>
		        </tr>
		      </thead>
		      
		      <tbody>
		        <tr data-toggle="modal" data-target="#blackUserInfo">
		            <td><input type="checkbox" name="checkRow"></td>
		            <td>01</td>
		            <td>user01</td>
		            <td>김민기</td>
		            <td>강동구</td>
		            <td>B</td>
		        </tr>
		        <tr data-toggle="modal" data-target="#falseUserInfo">
		            <td><input type="checkbox" name="checkRow"></td>
		            <td>02</td>
		            <td>user01</td>
		            <td>김민기</td>
		            <td>강동구</td>
		            <td>F</td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>&nbsp;</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td></td>
		        </tr>
		      </tbody>
		    </table>
		  </div>
		</div>
            
		<!-- 전체 선택 스크립트 -->
		<script>
		    function checkAll(){
		        if( $("#th_checkAll").is(':checked') ){
		            $("input[name=checkRow]").prop("checked", true);
		        }else{
		            $("input[name=checkRow]").prop("checked", false);
		        }
		    }
		    
		    function deleteBlack(){
		    	confirm("회원 정지를 해제시키겠습니까?");
		    	location.href="blackUser.jsp"
		    }
		    
		
		</script>
            
            
	<!-- search form -->
	<form class="navbar-form navbar-search" role="search">
	    <div class="input-group">
	    
	        <div class="input-group-btn">
	            <button type="button" class="btn btn-search btn-default dropdown-toggle" data-toggle="dropdown">
	                <span class="glyphicon glyphicon-search"></span>
	                <span class="label-icon">전체</span>
	                <span class="caret"></span>
	            </button>
	            <ul class="dropdown-menu pull-left" role="menu">
	              <li>
	                <a href="#">
	                    <span class="glyphicon glyphicon-user"></span>
	                    <span class="label-icon">이름</span>
	                </a>
	              </li>
	               <li>
	                    <a href="#">
	                        <span class="glyphicon glyphicon-user"></span>
	                        <span class="label-icon">예약 번호</span>
	                    </a>
	                </li>
	                
	                <li>
	                    <a href="#">
	                    <span class="glyphicon glyphicon-book"></span>
	                    <span class="label-icon">차량 번호</span>
	                    </a>
	                </li>
	            </ul>
	        </div>
	
	        <input type="text" class="form-control">
	    
	        <div class="input-group-btn">
	            <button type="button" class="btn btn-search btn-default" id="searching">검색</button> 
	        </div>
	    </div>  
	</form>   

        <div class="pagination">
             <a href="#"> &lt;&lt; </a>
            <a href="#"> &lt; </a>
            <li><a href="#home">1</a></li>
            <li><a href="#home">2</a></li>
            <li><a href="#home">3</a></li>
            <li><a href="#home">4</a></li>
            <li><a href="#home">5</a></li>
            <a href="#"> &gt; </a>
            <a href="#"> &gt;&gt; </a>
        </div>
		
	</div>

		

</body>
</html>