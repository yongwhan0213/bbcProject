/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-23 12:05:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.branch.helpcenter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bbc.notice.model.vo.Notice;
import com.bbc.attachment.model.vo.Attachment;
import java.util.ArrayList;

public final class noticeDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/branch/helpcenter/../../../views/branch/common/menubar.jsp", Long.valueOf(1584950460296L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.bbc.attachment.model.vo.Attachment");
    _jspx_imports_classes.add("com.bbc.notice.model.vo.Notice");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");

	Notice n = (Notice)request.getAttribute("nList");
	ArrayList<Attachment> a = (ArrayList<Attachment>)request.getAttribute("aList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
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
      out.write("\t\t\t\t\t<div class=\"h-bar list-bar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"logout-bt\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-sign-out-alt logout-icon\"> log out </i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- DataTales Example -->\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-event\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>공지사항</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"tab-divider black-divider\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"tit-name\">");
      out.print( n.getNoticeTitle() );
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<em class=\"status\">");
      out.print( n.getEnrollDate() );
      out.write("</em>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"list-bt m-list-bt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"list-modify-bt\" id=\"notice-detail-modify-bt\" onclick=\"modifyNotice();\">수정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#notice-delete-Modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"list-delete-bt\" id=\"notice-detail-delete-bt\">삭제</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"tab-divider\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"chk_imp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if(n.getNoticeImport() == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" checked disabled> 중요 공지사항\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 사진 불러오기 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 for(int i=0; i<a.size(); i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/board_upfiles/");
      out.print( a.get(i).getRename() );
      out.write("\" width=\"100px\" height=\"100px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"detail-cnt\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( n.getNoticeContent() );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- End of wrap-event-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"view-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"tb_col\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<col>\r\n");
      out.write("\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"next\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>다음</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"left\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/detail.b.no?nno=");
      out.print( n.getNext() );
      out.write("\">멤버십 서비스 이용 불가 안내</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>2020-02-26</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"current\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>-</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"left\">현대카드 시스템 점검으로 인해 서비스 중단 공지</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>2020-02-24</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>이전</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><a href=\"");
      out.print( request.getContextPath() );
      out.write("/detail.b.no?nno=");
      out.print( n.getPrev() );
      out.write("\">브라우저 시스템 점검 안내</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>2020-02-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn btn-search btn-default back-list\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"notice-back-list\" onclick=\"backNotice();\">목록</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End of Page Wrapper -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- notice Delete Modal -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"notice-delete-Modal\" tabindex=\"-1\"\r\n");
      out.write("\t\trole=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button class=\"close\" type=\"button\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">공지사항을 삭제하시겠습니까?</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" href=\"javascript:deleteNoticeOne();\">삭제</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t \tfunction backNotice(){\r\n");
      out.write("\t \t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/notice.b.no\";\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t \tfunction deleteNoticeOne(){\r\n");
      out.write("\t \t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/deleteOne.b.no?nno=");
      out.print( n.getNoticeNo() );
      out.write("\";\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t \tfunction modifyNotice(){\r\n");
      out.write("\t \t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/modifyForm.b.no?nno=");
      out.print( n.getNoticeNo() );
      out.write("\";\r\n");
      out.write("\t \t}\r\n");
      out.write(" \t</script>\r\n");
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
