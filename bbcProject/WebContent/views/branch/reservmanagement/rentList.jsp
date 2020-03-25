<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.bbc.common.page.vo.PageInfo, com.bbc.reservation.model.vo.Reservation" %>
<%
	ArrayList<Reservation> rentList = (ArrayList<Reservation>)request.getAttribute("rentList");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%= request.getContextPath() %>/resources/css/sb-admin-2.css" rel="stylesheet">
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
							<h1>대여 리스트</h1>
						</div>

						<hr class="tab-divider">

						<div class="tab-content">
							<div id="home" class="container tab-pane active">
								<br>

								<table id="rent-list-table" class="table table-bordered">
									<thead>
										<tr>
											<th>이름</th>
											<th>대여 번호</th>
											<th>차종</th>
											<th>차량 번호</th>
											<th>대여 기간</th>
										</tr>
									</thead>

									<tbody>
										<% if(rentList.isEmpty()) { %>
											<tr>
												<td colspan="5">조회된 회원이 없습니다.</td>
											</tr>
										<% } else { %>
											<% for(Reservation r : rentList) { %>
												<tr>
													<td><%= r.getMemberName() %></td>
													<td><%= r.getReservationNo() %></td>
													<td><%= r.getCarName() %></td>
													<td><%= r.getCarNo() %></td>
													<td><%= r.getRentDate() %> ~ <%= r.getReturnDate() %></td>
												</tr>
											<% } %>
										<% } %>
									</tbody>
								</table>
							</div>
						</div>

						<!-- search form -->
						<form class="navbar-form navbar-search" role="search">
							<div class="input-group">

								<div class="input-group-btn">
									<button type="button"
										class="btn btn-search btn-default dropdown-toggle"
										data-toggle="dropdown">
										<span class="glyphicon glyphicon-search"></span> <span
											class="label-icon">전체</span> <span class="caret"></span>
									</button>
									<ul class="dropdown-menu pull-left" role="menu">
										<li><a href="#"> <span
												class="glyphicon glyphicon-user"></span> <span
												class="label-icon">이름</span>
										</a></li>
										<li><a href="#"> <span
												class="glyphicon glyphicon-user"></span> <span
												class="label-icon">대여 번호</span>
										</a></li>
										<li><a href="#"> <span
												class="glyphicon glyphicon-book"></span> <span
												class="label-icon">차량 번호</span>
										</a></li>
									</ul>
								</div>

								<input type="text" class="form-control">

								<div class="input-group-btn">
									<button type="button" class="btn btn-search btn-default"
										id="searching">검색</button>


								</div>
							</div>
						</form>

						<!-- 페이징 바 영역 -->
						<div class="pagination">
						
							<!-- (<<) -->
							<button class="page-bt" onclick="location.href='<%= request.getContextPath()%>/rentList.b.rv';"> &lt;&lt; </button>
							
							<!-- (<) -->
							<% if(currentPage == 1) { %>
								<button class="page-bt" disabled> &lt; </button>
							<% } else { %>
								<button class="page-bt" onclick="location.href='<%= request.getContextPath() %>/rentList.b.rv?currentPage=<%= currentPage - 1 %>';"> &lt; </button>
							<% } %>
							
							<% for(int p=startPage; p<=endPage; p++) { %>
								<% if(currentPage == p) { %>
									<button class="page-bt" style="background:orange; color:white;" disabled><%= p %></button>
								<% } else { %>
									<button class="page-bt" onclick="location.href='<%= request.getContextPath() %>/rentList.b.rv?currentPage=<%= p %>';"><%= p %></button>
								<% } %>
							<% } %>
							
							<!-- (>) -->
							<% if(currentPage == maxPage) { %>
								<button class="page-bt" disabled> &gt; </button>
							<% } else { %>
								<button class="page-bt" onclick="location.href='<%= request.getContextPath() %>/rentList.b.rv?currentPage=<%= currentPage + 1 %>';"> &gt; </button>
							<% } %>
							
							<!-- (>>) -->
							<button class="page-bt" onclick="location.href='<%= request.getContextPath()%>/rentList.b.rv?currentPage=<%= maxPage %>';"> &gt;&gt; </button>
						</div>

					</div>
					<!-- /.container-fluid -->


				</div>
			</div>
		</div>
	</div>
	
	<script>
	
		$(function(){
	     	$("#rent-list-table>tbody>tr").click(function(){
	     		var no = $(this).children().eq(1).text();
	     		location.href="<%= request.getContextPath() %>/detailRent.b.rv?no=" + no;
	     	})
	     });
	</script>
</body>
</html>