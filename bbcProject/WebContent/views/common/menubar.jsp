<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<% 
	String contextPath = request.getContextPath();
	String parentMenu = (String)request.getAttribute("parentMenu");	
	String currentMenu = (String)request.getAttribute("currentMenu");
%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>BBC</title>	
	<!--  모달창 관련 파일 : bootstrap.css, jquery.min.js, bootstrap.js -->
	<!--  달력 관련 파일 : daterangepicker.css, moment.min.js, daterangepicker.js -->	
	<link href="<%=contextPath%>/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />	
	<link href="<%=contextPath%>/resources/css/common/menubar.css" rel='stylesheet' type='text/css' /> 
	<link href="<%=contextPath%>/resources/css/fontawesome-all.css" rel="stylesheet">
	<link href="<%=contextPath%>/resources/css/reservation/daterangepicker.css" rel="stylesheet" type="text/css" media="all">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="<%=contextPath%>/resources/js/index/bootstrap.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.1/moment.min.js"></script>
	<script type="text/javascript" src="<%=contextPath%>/resources/js/reservation/daterangepicker.js"></script>
	<link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,900" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700" rel="stylesheet">
</head>
<body>
	<!--/banner-->
	<div class="banner-inner-sub" id="home">
		<!-- header -->
		<header>
			<nav class="navbar navbar-expand-lg navbar-light bg-light top-header">
				<button class="navbar-toggler mx-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
				    aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<!-- login -->
				<!-- <div class="search">  -->
					<div class="cd-main-header">
						<ul class="cd-header-buttons">
							<li>로그인</li>
						</ul>
					</div>
				<!-- </div> -->
				<!-- //login-->

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mx-auto">
						<li class="nav-item">
							<a class="nav-link ml-lg-0" href="index.html">Home
								<span class="sr-only">(current)</span>
							</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="about.html">차량예약</a>
						</li>
						
						
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true"
							    aria-expanded="false">
								마이페이지
							</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item text-center" href="">차량 이용 내역</a>
								<a class="dropdown-item text-center" href="">예약 내역 조회</a>
								<a class="dropdown-item text-center" href="">쿠폰함 조회</a>
								<a class="dropdown-item text-center" href="">운전면허 등록/수정</a>
								<a class="dropdown-item text-center" href="">나의 문의 내역</a>
								<a class="dropdown-item text-center" href="">나의 지점 관리</a>
								<a class="dropdown-item text-center" href="">회원 정보 수정</a>
							</div>
						</li>
						
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true"
							    aria-expanded="false">
								고객센터
							</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item text-center" href="">FAQ</a>
								<a class="dropdown-item text-center" href="">고객의견</a>
								<a class="dropdown-item text-center" href="">1:1 상담</a>
								<a class="dropdown-item text-center" href="">공지사항</a>
							</div>
						</li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- //header -->
	</div>	
	<!-- currentMenu 회색바 -->
	<ol class="breadcrumb">
		<li class="breadcrumb-item">
			<a href="<%=contextPath%>">Home</a>
		</li>		
		<% if(parentMenu != null && parentMenu.length() != 0){ %>
		<%		String[] parentMenuArr = parentMenu.split("\\^"); %>
		<%     	for(int i=0; i<parentMenuArr.length; i++) { %>
					<li class="breadcrumb-item"><%=parentMenuArr[i]%></li> 
		<%		} %>
		<% } %>	
		<li class="breadcrumb-item active"><%=currentMenu%></li>
	</ol>
	<!-- // currentMenu -->	
	
</body>
</html>