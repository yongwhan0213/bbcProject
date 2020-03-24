<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- 공통 -->
<link href="<%= request.getContextPath() %>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<script src="<%= request.getContextPath() %>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="<%= request.getContextPath() %>/resources/vendor/jquery/jquery.js"></script>
<script src="<%= request.getContextPath() %>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>



<link href="<%= request.getContextPath() %>/resources/css/common/menubar.css" rel="stylesheet">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Sidebar -->
	<ul class="navbar-nav sidebar sidebar-dark accordion"
		id="accordionSidebar">

		<!-- Sidebar - Home -->
		<a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath() %>/views/branch/common/branchmain.jsp">
			<div class="sidebar-brand-text mx-3">
				BBC <i class="fa fa-home fa-fw home-icon"></i>
			</div>
		</a>

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><i class="nav-link fa fa-user fa-5x"></i>
			<p class="m-name">지점 관리자</p></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Nav Item - 예약 관리 Collapse Menu -->
		<li class="nav-item">
			<a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapseTwo"
			aria-expanded="true" aria-controls="collapseTwo"> <i
				class="fa fa-book fa-fw"></i> <span>예약 관리</span>
			</a>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
				data-parent="#accordionSidebar">
				<div class="py-2 collapse-inner rounded">
					<a class="collapse-item" href="#" onclick="goWholeList();">전체조회</a>
					<a class="collapse-item" href="#" onclick="goRentList();">대여리스트</a>
					<a class="collapse-item" href="#" onclick="goReturnManage();">반납처리 </a>
					<a class="collapse-item" href="#" onclick="goReservClient();">예약 회원 조회 </a>
				</div>
			</div>
		</li>
		
		<script>
			function goWholeList(){
				location.href="<%= request.getContextPath() %>/wholeList.b.rv";
			}
			
			function goRentList(){
				location.href="<%= request.getContextPath() %>/rentList.b.rv";
			}
			
			function goReturnManage(){
				location.href="<%= request.getContextPath() %>/returnManage.b.rv";
			}
			
			function goReservClient(){
				location.href="<%= request.getContextPath() %>/reservClient.b.rv";
			}
		</script>

		<!-- Nav Item - 고객 센터 Collapse Menu -->
		<li class="nav-item">
			<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
				aria-expanded="true" aria-controls="collapseUtilities">
				<i class="fas fa-fw fa-users"></i>
				<span>고객 센터</span>
			</a>
			<div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
				<div class="py-2 collapse-inner rounded">
					<a class="collapse-item" href="#" onclick="goNotice();">공지사항</a>
					<a class="collapse-item" href="#" onclick="goEvent();">이벤트 관리</a>
				</div>
			</div>
		</li>
		
		<script>
			function goNotice(){
				location.href="<%=request.getContextPath()%>/notice.b.no";
			}
			
			function goEvent(){
				location.href="<%=request.getContextPath()%>/event.b.ev";
			}
		</script>

		<!-- Nav Item - 차량 관리 Collapse Menu -->
		<li class="nav-item">
			<a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseCar"
				aria-expanded="true" aria-controls="collapseCar">
				<i class="fas fa-fw fa-car"></i>
				<span>차량 관리</span>
			</a>
			<div id="collapseCar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
				<div class="py-2 collapse-inner rounded">
					<a class="collapse-item" href="#" onclick="goCurrentCar();">보유 차량 </a>
					<a class="collapse-item" href="#" onclick="goEnrollCar();">차량 등록 </a>
					<a class="collapse-item" href="#" onclick="goDeleteCar();">차량 삭제 </a>
				</div>
			</div>
		</li>

	</ul>
	
	<script>
		function goCurrentCar(){
			location.href="<%=request.getContextPath()%>/carList.b.ci";
		}
		
		function goEnrollCar(){
			location.href="<%=request.getContextPath()%>/enrollCar.b.ci";
		}
		
		function goDeleteCar(){
			location.href="<%=request.getContextPath()%>/deleteCar.b.ci";
		}
	</script>



	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>