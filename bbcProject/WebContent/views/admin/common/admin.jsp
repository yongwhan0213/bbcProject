<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Admin Main Page</title>

  <!-- Custom fonts for this template-->
  <link href="<%=request.getContextPath() %>/resources/css/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<%=request.getContextPath() %>/resources/css/admin/sb-admin-2.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Home -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%=contextPath%>/views/admin/common/admin.jsp">
        <div class="sidebar-brand-text mx-3">
          BBC
          <i class="fa fa-home fa-fw home-icon"></i>
        </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        
          <i class="nav-link fa fa-user fa-5x"></i>
          <p class="m-name">통합 관리자</p>
        
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Nav Item - 고객센터 Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fa fa-book fa-fw"></i>
          <span>고객센터</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar" aria-exppanded="true">
          <div class="py-2 collapse-inner rounded">
            <a class="collapse-item" id="faq" onclick="faqList();">FAQ</a>
            <a class="collapse-item" id="notice" onclick="userNoticeList();">공지사항</a>
            <a class="collapse-item" id="qa" onclick="InquiryList();">문의내역</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - 지점 관리 Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-users"></i>
          <span>지점 관리</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="py-2 collapse-inner rounded">
            <a class="collapse-item" onclick="userNoticeList();">공지사항</a>
            <a class="collapse-item" onclick="branchList();">지점등록</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - 회원 관리 Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseCar" aria-expanded="true" aria-controls="collapseCar">
          <i class="fas fa-fw fa-users"></i>
          <span>회원 관리</span>
        </a>
        <div id="collapseCar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="py-2 collapse-inner rounded">
            <a class="collapse-item" onclick="couponList();">쿠폰등록</a>
            <a class="collapse-item" onclick="memberList();">회원조회</a>
            <a class="collapse-item" onclick="blackList();">회원정지</a>
          </div>
        </div>
      </li>
      
      <!-- Nav Item - 차량 관리 Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#test" aria-expanded="true" aria-controls="test">
          <i class="fas fa-fw fa-car"></i>
          <span>차량 관리</span>
        </a>
        <div id="test" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="py-2 collapse-inner rounded">
            <a class="collapse-item" href="<%=contextPath%>/views/admin/car/carAdd.jsp">차량등록</a>
            <a class="collapse-item" href="<%=contextPath%>/views/admin/car/priceInfo.jsp">금액정보</a>
          </div>
        </div>
      </li>

    </ul>
    <!-- End of Sidebar -->
    
    <!-- 페이지 이동 script -->
    <script>
    	function faqList(){
    		location.href = "<%=contextPath%>/list.t.fa";
    	}
    	
    	function userNoticeList(){
    		location.href = "<%=contextPath%>/uList.t.no";
    	}
    	
    	function InquiryList(){
    		location.href = "<%=contextPath%>/list.t.mi";
    	}
    	
    	function branchList(){
    		location.href = "<%=contextPath%>/list.t.br";
    	}
    	
    	function couponList(){
    		location.href = "<%=contextPath%>/list.t.co";
    	}
    	
    	function memberList(){
    		location.href = "<%=contextPath%>/list.t.ui";
    	}
    
		function blackList(){
			location.href = "<%=contextPath%>/blackList.t.ui";
		}    
    </script>


    
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">


        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Content Row -->
          <div class="h-bar">

          <a href="#" class="logout-bt">
            <i class="fas fa-sign-out-alt logout-icon">
              log out
            </i>
          </a>
          <!-- Pending Requests Card Example -->
          <div class="col-xl-3 col-md-6 mb-4">
            <div class="h-100 py-2">
                <div class="row no-gutters align-items-center">
                  <div class="col-auto">
                    </div>
                  </div>
              </div>
            </div>
            
          </div>

          
          <!-- Content Row -->

          <div class="row">

            <!-- Area Table -->
            <div class="col-xl-8 col-lg-7">
              <div class="card shadow mb-4">
                <!-- Card Header -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold">공지사항</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body container">
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성일</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>1</td>
                        <td> 1월 3일 11시~11시10분 삼성카드 결제 중단 안내</td>
                        <td>2020-02-14</td>
                      </tr>
                      <tr>
                        <td>2</td>
                        <td>1월 3일 11시~11시10분 삼성카드 결제 중단 안내</td>
                        <td>2020-02-14</td>
                      </tr>
                      <tr>
                        <td>3</td>
                        <td>1월 3일 11시~11시10분 삼성카드 결제 중단 안내</td>
                        <td>2020-02-14</td>
                      </tr>
                      <tr>
                        <td>4</td>
                        <td>1월 3일 11시~11시10분 삼성카드 결제 중단 안내</td>
                        <td>2020-02-14</td>
                      </tr>
                      <tr>
                        <td>5</td>
                        <td>1월 3일 11시~11시10분 삼성카드 결제 중단 안내</td>
                        <td>2020-02-14</td>
                      </tr>
                    </tbody>
                  </table>

                  <div class="paginate">
                    <a href="#" class="prev">prev</a>
                    <a href="#">1</a>
                    <a href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#" class="next">next</a>
                  </div>

                </div>

              </div>

            </div>

            <!-- Pie Chart -->
            <div class="col-xl-4 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header-->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
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
          <div class="card shadow mb-4" style="background-color: white;">
            <div class="card-header py-3" style="background-color: whitesmoke;">
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
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath() %>/resources/css/admin/vendor/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath() %>/resources/css/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="<%=request.getContextPath() %>/resources/css/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="<%=request.getContextPath() %>/resources/js/admin/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="<%=request.getContextPath() %>/resources/css/admin/vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="<%=request.getContextPath() %>/resources/js/admin/demo/chart-area-demo.js"></script>
  <script src="<%=request.getContextPath() %>/resources/js/admin/demo/chart-pie-demo.js"></script>

</body>

</html>