<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link
	href="<%= request.getContextPath() %>/resources/css/sb-admin-2.css"
	rel="stylesheet">

</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<%@ include file="../../../views/branch/common/menubar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">


				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Content Row -->
					<div class="h-bar list-bar">

						<a href="#" class="logout-bt" data-toggle="modal"
							data-target="#logoutModal"> <i
							class="fas fa-sign-out-alt logout-icon"> log out </i>
						</a>
					</div>



					<!-- DataTales Example -->
					<div class="container">

						<div class="tab-name">
							<h1>상세 조회</h1>
						</div>

						<h5 id="divider-name">
							<li class="fas fa-fw fa-user-edit"></li>대여 정보
						</h5>

						<h5 id="info-client">
							회원 정보
							<hr id="info-client-hr">
						</h5>

						<!-- 회원 정보 div -->
						<div>
							<table class="table info-client-table rent-user-table">
								<tr>
									<th scope="row">이름</th>
									<td>여민진</td>
								</tr>
								<tr>
									<th scope="row">주소</th>
									<td>서울특별시</td>
								</tr>
								<tr>
									<th scope="row">주민등록번호</th>
									<td>961213 - 2******</td>
								</tr>
								<tr>
									<th scope="row">연락처</th>
									<td>010 - 1234 - 5678</td>
								</tr>
								<tr>
									<th scope="row">이메일</th>
									<td>adfsf@google.com</td>
								</tr>
							</table>
						</div>

						<h5 id="info-client">
							대여 정보
							<hr id="info-client-hr">
						</h5>

						<!-- 대여 정보 div-->
						<div>
							<table class="table info-client-table info-table rent-table">
								<tr>
									<th rowspan="4"><img id="car-img"
										src="https://imageonthefly.autodatadirect.com/images/?USER=eDealer&PW=edealer872&IMG=USC80HOC091A021001.jpg&width=440&height=262"></th>
									<th>차종</th>
									<th>차량 번호</th>
									<th>대여 번호</th>
									<th>대여 기간</th>
									<th>결제 금액</th>
									<th>결제 일시</th>
									<th>결제 방식</th>
									<th>환불 여부</th>
									<th>환불 일시</th>
								</tr>
								<tr>
									<td>제네시스</td>
									<td>xx가 xxxx</td>
									<td>548285</td>
									<td>2020.02.05 ~ 2020.02.07</td>
									<td>109,000원</td>
									<td>2018.01.24</td>
									<td>신용카드</td>
									<td>진행중</td>
									<td>2018.02.04</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>



</body>
</html>