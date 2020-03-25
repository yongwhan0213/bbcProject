<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
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
	
		
	form {                                         
	   	
	    width: 860px; 
	}
	.str{
	    color:red;
	    font-size: 10px;
	}
	form input{
	   border-radius: 3px;
	    height:20px;
	    margin-left:5px;
	}
	    
	.search{
	        background: #ffc107;
	        color:white;
	        font-weight:bold;
	        width: 80px;
	        height: 30px;
	        border-radius: 4px;
	        margin-top: 60px;
	        text-align:center;
	     
	        font-size: 15px;
	    }
	b{
		color:black;
	}
	
</style>
</head>
<body>

  <%@ include file="../common/menubar.jsp" %>

        <div class="outer"> 
            <span class="main-title">회원가입</span>
            <hr class="garo">
		
		<p style="margin-top:15px;color:black;"><strong> 회원정보입력</strong> &nbsp;<b class="str">*는 필수 입력항목입니다</b></p>

<hr>          
<form name="RegForm" action="" onsubmit="return verification();" method="post">  
      
    <p><b class="str">* &nbsp;</b><b>이름:</b> <input type="text" size=35 name="Name"> </p> 
    <hr>      
    <p><b class="str">* &nbsp;</b><b>아이디:</b> <input type="text" size=33 name="userId">  </p>
    <hr>
    <p><b class="str">* &nbsp;</b><b>비밀번호:</b> <input type="text" size=31 name="Password"> </p>
    <hr>
    <p><b class="str">* &nbsp;</b><b>비밀번호 확인:</b><input type="text" size=27 name="veriPassword"> </p>
    <hr>
    <p> <b class="str">* &nbsp;</b><b>휴대폰번호:</b><select name="type" style="height:23px;">
        <option value="선택">선택</option>
        <option value="KT">KT</option>
        <option value="SKT">SKT</option>
        <option value="LG">LG</option> 
        <input type="text" style="width:50px;"> -<input type="text" style="width:50px;">-<input type="text" style="width:50px;"></p>
    <hr>
    <p><b class="str">* &nbsp;</b><b>이메일 주소:</b> <input type="text" size=39 name="Email">  </p>
    <hr>
    <p><b class="str">* &nbsp;</b><b>주소:</b>  <input type="radio">&nbsp;자택 <input type="radio">&nbsp;직장 <br>
        <input type="submit" value="우편번호" name="zipCode" style="margin-left:45px;height:25px;text-align:center;font-size:10px;"><br>       
        <input type="text" size=63  name="address" style="margin-left:45px; margin-top:5px;">
        <input type="text" size=63  name="detailAddress" style="margin-left:45px; margin-top:5px;"> </p>   
           

    <p><center><input type="submit" value="등록" name="Submit" class="search" >      </center>  
    </p>          
</form> 
		</div>




<script> 
function verification()                                    
{ 
    
    var name = document.forms["RegForm"]["Name"];  
    var userId = document.forms["RegForm"]["userId"];  
    var Password = document.forms["RegForm"]["Password"];  
    var veriPassword = document.forms["RegForm"]["veriPassword"];  
    var email = document.forms["RegForm"]["Email"];  
    var zipCode = document.forms["RegForm"]["zipCode"];  
    var address = document.forms["RegForm"]["address"];  
    var detailAddress = document.forms["RegForm"]["detailAddress"];  

    if (name.value == "")                                  
    { 
        window.alert("이름을 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (userId.value == "")                                  
    { 
        window.alert("아이디를 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (Password.value == "")                                  
    { 
        window.alert("비밀번호를 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (veriPassword.value == "")                                  
    { 
        window.alert("비밀번호 확인 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (email.value == "")                                  
    { 
        window.alert("이메일 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (zipCode.value == "")                                  
    { 
        window.alert("우편번호 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (address.value == "")                                  
    { 
        window.alert("주소를 입력하세요."); 
        name.focus(); 
        return false; 
    } 
    if (detailAddress.value == "")                                  
    { 
        window.alert("상세주소를 입력하세요."); 
        name.focus(); 
        return false; 
    } 
   	
    window.alert("성공하였습니다.")
    
    return true;
}
</script> 
</body>
</html>