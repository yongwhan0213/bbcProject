/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-23 08:04:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/branch/common/branchmain.jsp", Long.valueOf(1584950519624L));
    _jspx_dependants.put("/views/branch/common/menubar.jsp", Long.valueOf(1584950460296L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/vendor/chart.js/Chart.min.js\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/js/demo/chart-area-demo.js\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/js/demo/chart-pie-demo.js\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Page Wrapper -->\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- 공통 -->\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/common/menubar.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Sidebar -->\r\n");
      out.write("\t<ul class=\"navbar-nav sidebar sidebar-dark accordion\"\r\n");
      out.write("\t\tid=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Sidebar - Home -->\r\n");
      out.write("\t\t<a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print( request.getContextPath() );
      out.write("/views/branch/common/branchmain.jsp\">\r\n");
      out.write("\t\t\t<div class=\"sidebar-brand-text mx-3\">\r\n");
      out.write("\t\t\t\tBBC <i class=\"fa fa-home fa-fw home-icon\"></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Divider -->\r\n");
      out.write("\t\t<hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Nav Item - Dashboard -->\r\n");
      out.write("\t\t<li class=\"nav-item active\"><i class=\"nav-link fa fa-user fa-5x\"></i>\r\n");
      out.write("\t\t\t<p class=\"m-name\">지점 관리자</p></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Divider -->\r\n");
      out.write("\t\t<hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Nav Item - 예약 관리 Collapse Menu -->\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t<a class=\"nav-link collapsed\" href=\"#\"\r\n");
      out.write("\t\t\tdata-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("\t\t\taria-expanded=\"true\" aria-controls=\"collapseTwo\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-book fa-fw\"></i> <span>예약 관리</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\"\r\n");
      out.write("\t\t\t\tdata-parent=\"#accordionSidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"py-2 collapse-inner rounded\">\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goWholeList();\">전체조회</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goRentList();\">대여리스트</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goReturnManage();\">반납처리 </a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goReservClient();\">예약 회원 조회 </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction goWholeList(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/wholeList.b.rv\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction goRentList(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/rentList.b.rv\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction goReturnManage(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/returnManage.b.rv\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction goReservClient(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/reservClient.b.rv\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Nav Item - 고객 센터 Collapse Menu -->\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t<a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("\t\t\t\taria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("\t\t\t\t<i class=\"fas fa-fw fa-users\"></i>\r\n");
      out.write("\t\t\t\t<span>고객 센터</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"py-2 collapse-inner rounded\">\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goNotice();\">공지사항</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goEvent();\">이벤트 관리</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction goNotice(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/notice.b.no\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction goEvent(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/event.b.ev\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Nav Item - 차량 관리 Collapse Menu -->\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t<a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseCar\"\r\n");
      out.write("\t\t\t\taria-expanded=\"true\" aria-controls=\"collapseCar\">\r\n");
      out.write("\t\t\t\t<i class=\"fas fa-fw fa-car\"></i>\r\n");
      out.write("\t\t\t\t<span>차량 관리</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div id=\"collapseCar\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"py-2 collapse-inner rounded\">\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goCurrentCar();\">보유 차량 </a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goEnrollCar();\">차량 등록 </a>\r\n");
      out.write("\t\t\t\t\t<a class=\"collapse-item\" href=\"#\" onclick=\"goDeleteCar();\">차량 삭제 </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goCurrentCar(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/carList.b.ci\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goEnrollCar(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/enrollCar.b.ci\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goDeleteCar(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/deleteCar.b.ci\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Logout Modal-->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("\t\t\t\t\t<button class=\"close\" type=\"button\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">Select \"Logout\" below if you are ready\r\n");
      out.write("\t\t\t\t\tto end your current session.</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Content Wrapper -->\r\n");
      out.write("\t\t<div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Main Content -->\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Begin Page Content -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Content Row -->\r\n");
      out.write("\t\t\t\t\t<div class=\"h-bar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"logout-bt\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#logoutModal\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt logout-icon\"> log out </i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Pending Requests Card Example -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h-100 py-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row no-gutters align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-auto\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Content Row -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Area Table -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-8 col-lg-7\">\r\n");
      out.write("\t\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"nav nav-tabs nav-fill\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-item nav-link active\" id=\"nav-home-tab\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"tab\" href=\"#nav-home\" role=\"tab\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-controls=\"nav-home\" aria-selected=\"true\">회원 공지사항\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-item nav-link\" id=\"nav-profile-tab\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-controls=\"nav-profile\" aria-selected=\"false\">지점 공지사항\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card shadow mb-4\" id=\"main-notice-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Card Header -->\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-content\" id=\"nav-tabContent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tab-pane fade show active\" id=\"nav-home\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>No</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>글쓴이</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>작성 일자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Integration Specialist</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>New York</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2012/12/02</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Sales Assistant</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>San Francisco</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2012/08/06</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>3</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Integration Specialist</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Tokyo</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2010/10/14</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>4</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Javascript Developer</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>San Francisco</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2009/09/15</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Software Engineer</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Edinburgh</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2008/12/13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-labelledby=\"nav-profile-tab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"table\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>No</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>글쓴이</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>작성 일자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>System Architect</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Edinburgh</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2011/04/25</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Accountant</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Tokyo</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2011/07/25</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>3</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Junior Technical Author</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>San Francisco</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2009/01/12</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>4</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Senior Javascript Developer</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Edinburgh</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2012/03/29</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Accountant</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Tokyo</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>2008/11/28</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"main-pagination\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"> &lt;&lt; </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"> &lt; </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"> &gt; </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"> &gt;&gt; </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Pie Chart -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card shadow mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Card Header-->\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"m-0 font-weight-bold\">이번 달 예약 건수</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Card Body -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chart-pie pt-4 pb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<canvas id=\"myPieChart\"></canvas>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-4 text-center small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"mr-2 pie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-circle\" id=\"pie-reservation\"></i> Reservation\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"mr-2 pie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-circle\" id=\"pie-none\"></i> None\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Bar Chart -->\r\n");
      out.write("\t\t\t\t<div class=\"card shadow mb-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-header py-3\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"m-0 font-weight-bold\" style=\"color: black;\">월 별 실적 현황</h6>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"chart-area\">\r\n");
      out.write("\t\t\t\t\t\t\t<canvas id=\"myAreaChart\"></canvas>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
