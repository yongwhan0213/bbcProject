<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  	
  		<%@ include file= "../../../views/branch/common/menubar.jsp" %>
  	
  		<!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">


        <!-- Begin Page Content -->
        <div class="container-fluid">

           <!-- Content Row -->
          <div class="h-bar list-bar">

          <a href="#" class="logout-bt" data-toggle="modal" data-target="#logoutModal">
            <i class="fas fa-sign-out-alt logout-icon">
              log out
            </i>
          </a>
        </div>

		          <!-- DataTales Example -->
          <div class="container">

            <div class="tab-name">
              <h1>예약 회원 조회</h1>
            </div>
            
            <hr class="tab-divider">
            <div class="tab-content">
              <div id="home" class="container tab-pane active"><br>
                
                <table id="reserv-user-table" class="table table-bordered" cellspacing="0">
                  <thead>
                    <tr>
                      <th>이름</th>
                      <th>예약 번호</th>
                      <th>차종</th>
                      <th>차량 번호</th>
                      <th>예약 기간</th>
                    </tr>
                  </thead>
                  
                  <tbody>
                    <tr>
                      <td>Tiger Nixon</td>
                      <td>System Architect</td>
                      <td>Edinburgh</td>
                      <td>61</td>
                      <td>2011/04/25</td>
                    </tr>
                    <tr>
                      <td>Garrett Winters</td>
                      <td>Accountant</td>
                      <td>Tokyo</td>
                      <td>63</td>
                      <td>2011/07/25</td>
                    </tr>
                    <tr>
                      <td>Ashton Cox</td>
                      <td>Junior Technical Author</td>
                      <td>San Francisco</td>
                      <td>66</td>
                      <td>2009/01/12</td>
                    </tr>
                    <tr>
                      <td>Cedric Kelly</td>
                      <td>Senior Javascript Developer</td>
                      <td>Edinburgh</td>
                      <td>22</td>
                      <td>2012/03/29</td>
                    </tr>
                    <tr>
                      <td>Airi Satou</td>
                      <td>Accountant</td>
                      <td>Tokyo</td>
                      <td>33</td>
                      <td>2008/11/28</td>
                    </tr>
                    <tr>
                      <td>Brielle Williamson</td>
                      <td>Integration Specialist</td>
                      <td>New York</td>
                      <td>61</td>
                      <td>2012/12/02</td>
                    </tr>
                    <tr>
                      <td>Herrod Chandler</td>
                      <td>Sales Assistant</td>
                      <td>San Francisco</td>
                      <td>59</td>
                      <td>2012/08/06</td>
                    </tr>
                    <tr>
                      <td>Rhona Davidson</td>
                      <td>Integration Specialist</td>
                      <td>Tokyo</td>
                      <td>55</td>
                      <td>2010/10/14</td>
                    </tr>
                    <tr>
                      <td>Colleen Hurst</td>
                      <td>Javascript Developer</td>
                      <td>San Francisco</td>
                      <td>39</td>
                      <td>2009/09/15</td>
                    </tr>
                    <tr>
                      <td>Sonya Frost</td>
                      <td>Software Engineer</td>
                      <td>Edinburgh</td>
                      <td>23</td>
                      <td>2008/12/13</td>
                    </tr>
                    <tr>
                      <td>Jena Gaines</td>
                      <td>Office Manager</td>
                      <td>London</td>
                      <td>30</td>
                      <td>2008/12/19</td>
                    </tr>
                    <tr>
                      <td>Quinn Flynn</td>
                      <td>Support Lead</td>
                      <td>Edinburgh</td>
                      <td>22</td>
                      <td>2013/03/03</td>
                    </tr>
                    <tr>
                      <td>Charde Marshall</td>
                      <td>Regional Director</td>
                      <td>San Francisco</td>
                      <td>36</td>
                      <td>2008/10/16</td>
                    </tr>
                    <tr>
                      <td>Haley Kennedy</td>
                      <td>Senior Marketing Designer</td>
                      <td>London</td>
                      <td>43</td>
                      <td>2012/12/18</td>
                    </tr>
                    <tr>
                      <td>Tatyana Fitzpatrick</td>
                      <td>Regional Director</td>
                      <td>London</td>
                      <td>19</td>
                      <td>2010/03/17</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            
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
                    <button type="button" class="btn btn-search btn-default"  id="searching">검색</button>
                     
                     
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
      <!-- /.container-fluid -->

    </div>
    <!-- End of Main Content -->

  </div>
  <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

</div>
</body>
</html>