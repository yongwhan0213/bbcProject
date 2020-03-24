<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="<%= request.getContextPath() %>/resources/vendor/chart.js/Chart.min.js" rel="stylesheet">
<link href="<%= request.getContextPath() %>/resources/js/demo/chart-area-demo.js" rel="stylesheet">
<link href="<%= request.getContextPath() %>/resources/js/demo/chart-pie-demo.js" rel="stylesheet">

<link href="<%= request.getContextPath() %>/resources/css/sb-admin-2.css" rel="stylesheet">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<%@ include file="menubar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">


				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Content Row -->
					<div class="h-bar">

						<a href="#" class="logout-bt" data-toggle="modal"
							data-target="#logoutModal"> <i
							class="fas fa-sign-out-alt logout-icon"> log out </i>
						</a>

						<!-- Pending Requests Card Example -->
						<div class="col-xl-3 col-md-6 mb-4">
							<div class="h-100 py-2">
								<div class="row no-gutters align-items-center">
									<div class="col-auto"></div>
								</div>
							</div>
						</div>

					</div>
				</div>



				<!-- Content Row -->

				<div class="row">

					<!-- Area Table -->
					<div class="col-xl-8 col-lg-7">
						<nav>
							<div class="nav nav-tabs nav-fill" id="nav-tab" role="tablist">
								<a class="nav-item nav-link active" id="nav-home-tab"
									data-toggle="tab" href="#nav-home" role="tab"
									aria-controls="nav-home" aria-selected="true">회원 공지사항
								</a>
								<a class="nav-item nav-link" id="nav-profile-tab"
									data-toggle="tab" href="#nav-profile" role="tab"
									aria-controls="nav-profile" aria-selected="false">지점 공지사항
								</a>
							</div>
						</nav>
						<div class="card shadow mb-4" id="main-notice-body">
							<!-- Card Header -->
							<div>
								<div class="col-md-12">

									<div class="tab-content" id="nav-tabContent">
										<div class="tab-pane fade show active" id="nav-home"
											role="tabpanel" aria-labelledby="nav-home-tab">
											<table class="table">
												<thead>
													<tr>
														<th>No</th>
														<th>제목</th>
														<th>글쓴이</th>
														<th>작성 일자</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>1</td>
														<td>Integration Specialist</td>
														<td>New York</td>
														<td>2012/12/02</td>
													</tr>
													<tr>
														<td>2</td>
														<td>Sales Assistant</td>
														<td>San Francisco</td>
														<td>2012/08/06</td>
													</tr>
													<tr>
														<td>3</td>
														<td>Integration Specialist</td>
														<td>Tokyo</td>
														<td>2010/10/14</td>
													</tr>
													<tr>
														<td>4</td>
														<td>Javascript Developer</td>
														<td>San Francisco</td>
														<td>2009/09/15</td>
													</tr>
													<tr>
														<td>5</td>
														<td>Software Engineer</td>
														<td>Edinburgh</td>
														<td>2008/12/13</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="tab-pane fade" id="nav-profile" role="tabpanel"
											aria-labelledby="nav-profile-tab">
											<table class="table" cellspacing="0">
												<thead>
													<tr>
														<th>No</th>
														<th>제목</th>
														<th>글쓴이</th>
														<th>작성 일자</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>1</td>
														<td>System Architect</td>
														<td>Edinburgh</td>
														<td>2011/04/25</td>
													</tr>
													<tr>
														<td>2</td>
														<td>Accountant</td>
														<td>Tokyo</td>
														<td>2011/07/25</td>
													</tr>
													<tr>
														<td>3</td>
														<td>Junior Technical Author</td>
														<td>San Francisco</td>
														<td>2009/01/12</td>
													</tr>
													<tr>
														<td>4</td>
														<td>Senior Javascript Developer</td>
														<td>Edinburgh</td>
														<td>2012/03/29</td>
													</tr>
													<tr>
														<td>5</td>
														<td>Accountant</td>
														<td>Tokyo</td>
														<td>2008/11/28</td>
													</tr>
												</tbody>
											</table>
										</div>


										<div class="main-pagination">
											<a href="#"> &lt;&lt; </a>
											<a href="#"> &lt; </a>
											<a href="#"> &gt; </a>
											<a href="#"> &gt;&gt; </a>
										</div>
									</div>
								</div>
							</div>

						</div>

					</div>

					<!-- Pie Chart -->
					<div class="col-xl-4 col-lg-5">
						<div class="card shadow mb-4">
							<!-- Card Header-->
							<div
								class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
								<h6 class="m-0 font-weight-bold">이번 달 예약 건수</h6>
							</div>
							<!-- Card Body -->
							<div class="card-body">
								<div class="chart-pie pt-4 pb-2">
									<canvas id="myPieChart"></canvas>
								</div>
								<div class="mt-4 text-center small">
									<span class="mr-2 pie-name">
										<i class="fas fa-circle" id="pie-reservation"></i> Reservation
									</span>
									<span class="mr-2 pie-name">
										<i class="fas fa-circle" id="pie-none"></i> None
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Bar Chart -->
				<div class="card shadow mb-4">
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold" style="color: black;">월 별 실적 현황</h6>
					</div>
					<div class="card-body">
						<div class="chart-area">
							<canvas id="myAreaChart"></canvas>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- End of Content Wrapper -->

	</div>


</body>
</html>