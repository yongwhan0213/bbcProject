/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-25 01:47:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.reservation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservationOption2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/reservation/../common/menubar.jsp", Long.valueOf(1585099884933L));
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

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>차량예약</title>\r\n");
      out.write("<link href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/reservation/reservation.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 상단 메뉴바 include -->\r\n");
      out.write("\t");
      out.write("  \r\n");
 
	String contextPath = request.getContextPath();
	String parentMenu = (String)request.getAttribute("parentMenu");	
	String currentMenu = (String)request.getAttribute("currentMenu");

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>BBC</title>\t\r\n");
      out.write("\t<!--  모달창 관련 파일 : bootstrap.css, jquery.min.js, bootstrap.js -->\r\n");
      out.write("\t<!--  달력 관련 파일 : daterangepicker.css, moment.min.js, daterangepicker.js -->\t\r\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/resources/css/bootstrap.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/resources/css/common/menubar.css\" rel='stylesheet' type='text/css' /> \r\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/resources/css/fontawesome-all.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(contextPath);
      out.write("/resources/css/reservation/daterangepicker.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(contextPath);
      out.write("/resources/js/index/bootstrap.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.1/moment.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/resources/js/reservation/daterangepicker.js\"></script>\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,900\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--/banner-->\r\n");
      out.write("\t<div class=\"banner-inner-sub\" id=\"home\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light top-header\">\r\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler mx-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("\t\t\t\t    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- login -->\r\n");
      out.write("\t\t\t\t<!-- <div class=\"search\">  -->\r\n");
      out.write("\t\t\t\t\t<div class=\"cd-main-header\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"cd-header-buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>로그인</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t\t\t<!-- //login-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav mx-auto\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link ml-lg-0\" href=\"index.html\">Home\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"about.html\">차량예약</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t    aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t마이페이지\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">차량 이용 내역</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">예약 내역 조회</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">쿠폰함 조회</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">운전면허 등록/수정</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">나의 문의 내역</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">나의 지점 관리</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">회원 정보 수정</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t    aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t고객센터\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">FAQ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">고객의견</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">1:1 상담</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-item text-center\" href=\"\">공지사항</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!-- //header -->\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- currentMenu 회색바 -->\r\n");
      out.write("\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t<li class=\"breadcrumb-item\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("\">Home</a>\r\n");
      out.write("\t\t</li>\t\t\r\n");
      out.write("\t\t");
 if(parentMenu != null && parentMenu.length() != 0){ 
      out.write("\r\n");
      out.write("\t\t");
		String[] parentMenuArr = parentMenu.split("\\^"); 
      out.write("\r\n");
      out.write("\t\t");
     	for(int i=0; i<parentMenuArr.length; i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"breadcrumb-item\">");
      out.print(parentMenuArr[i]);
      out.write("</li> \r\n");
      out.write("\t\t");
		} 
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\t\r\n");
      out.write("\t\t<li class=\"breadcrumb-item active\">");
      out.print(currentMenu);
      out.write("</li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\t<!-- // currentMenu -->\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<!-- div outer -->\r\n");
      out.write("\t<div class=\"outer\">\t\r\n");
      out.write("\t\t<div class=\"main-title\">차량예약</div>\r\n");
      out.write("\t\t<hr class=\"garo\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<!-- div car-info-left -->\r\n");
      out.write("\t\t<td valign=\"top\">\r\n");
      out.write("\t\t<div class=\"option-left\">\t\r\n");
      out.write("\t\t\t<div class=\"option-left-top\">\t\r\n");
      out.write("\t\t\t\t<div class=\"box-schd\">\r\n");
      out.write("\t\t\t\t\t<span id=\"rentInfo\"><strong>강남</strong><strong>2020-03-07 10시 00분</strong></span>\r\n");
      out.write("\t\t\t\t\t\t<em class=\"ico-to\">to</em>\r\n");
      out.write("\t\t\t\t\t<span id=\"returnInfo\"><strong>강남</strong><strong>2020-03-08 10시 00분</strong></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"carInfo\" class=\"box-car\">아반떼 AD (D) F/L\r\n");
      out.write("\t\t\t\t\t<div class=\"img-car\"><img src=\"");
      out.print(contextPath);
      out.write("/resources/images/car/newavante.png\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"f10 txt-gray1 txt-center pb25\">실제 대여하는 차량과 외관, 색상, 옵션 등 차이가 있을 수 있으며<br>사고 또는 고장 등 부득이한 경우 동급차종으로 변경될 수 있습니다.</p>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<div class=\"box-price\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<!-- 대여금액 -->\r\n");
      out.write("                \t<li>\r\n");
      out.write("\t                \t<span class=\"tit\">대여금액</span><span class=\"price\" id=\"rentalFee\"><strong>110,000</strong><em>원</em></span>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t<!-- 할인금액 -->\r\n");
      out.write("                    <li>\r\n");
      out.write("\t                \t<span class=\"tit\">할인금액</span><span class=\"price\" id=\"totalDiscountFeeView\"><strong>-55,000</strong><em>원</em></span>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"detail\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"eventShow\">[서울전지점]3월 안전하고 건강한여행(50% 할인)</span><span class=\"price\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                     </li>\r\n");
      out.write("\t\t\t\t\t<!-- 보험및기타옵션 -->\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t                \t<span class=\"tit\">보험 및 기타 옵션</span><span class=\"price\" id=\"totalOptionFeeView\"><strong>0</strong><em>원</em></span>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"detail\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"tit\" id=\"cdwNameShow\">보험 미적용</span><span class=\"price\" id=\"cdwFee\">0원</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\t\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"tit\" id=\"babySeatShow\">베이비 시트</span><span class=\"price\" id=\"babySeatFee\">0원</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                     </li>\r\n");
      out.write("\t\t\t\t\t<!-- 금액 -->\r\n");
      out.write("                    <li class=\"total\">\r\n");
      out.write("                    \t<span class=\"tit\">금액</span><span class=\"price\" id=\"totalRentalFeeView\"><strong>55,000</strong><em>원</em></span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /div car-info-left -->\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t</td>\t\t\r\n");
      out.write("\t\t<td valign=\"top\">\r\n");
      out.write("\t\t<!-- div car-info-right -->\r\n");
      out.write("\t\t<div class=\"option-right\">\r\n");
      out.write("\t\t\t<label class=\"option-right-hr f15\">개인 정보</label>\t\t\t\r\n");
      out.write("\t\t\t<div class=\"grid mt10\">\r\n");
      out.write("            \t<table class=\"tb-noBorder\">\r\n");
      out.write("                \t<colgroup>\r\n");
      out.write("                      \t<col style=\"width:110px\">\r\n");
      out.write("                      \t<col style=\"width:auto\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    \t<tr>\r\n");
      out.write("                        \t<th>회원등급</th>\r\n");
      out.write("                        \t<td>\r\n");
      out.write("                        \t<input type=\"text\" id=\"memberGrade\" name=\"memberGrade\" value=\"일반회원\" readonly>\r\n");
      out.write("                        \t</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>이름</th>\r\n");
      out.write("                            <td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"userName\" name=\"userName\" title=\"이름\" placeholder=\"이름을 입력하세요.\" value=\"홍길동\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("                        \t<th>이메일</th>\r\n");
      out.write("                            <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"userEmail\" id=\"userEmail\" maxlength=\"80\" value=\"khhong@naver.com\" title=\"이메일\" placeholder=\"이메일을 입력하세요.\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                           <th>휴대전화</th>\r\n");
      out.write("                           <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input  type=\"text\" name=\"phone1\" id=\"phone1\" title=\"휴대폰 첫번째 숫자\" style=\"width:76px;\" value=\"\" maxlength=\"4\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                                <span class=\"hyphen\"> - </span>\r\n");
      out.write("                                <input  type=\"text\" name=\"phone2\" id=\"phone2\" title=\"휴대폰 가운데 숫자\" style=\"width:100px;\" value=\"\" maxlength=\"4\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                                <span class=\"hyphen\"> - </span>\r\n");
      out.write("                                <input  type=\"text\" name=\"phone3\" id=\"phone3\" title=\"휴대폰 마지막 숫자\" style=\"width:100px;\" value=\"\" maxlength=\"4\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                           </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                   </tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t<p class=\"hg-30\"></p>\r\n");
      out.write("\t\t\t<label class=\"option-right-hr f15\">운전면허 정보</label>\t\t\t\r\n");
      out.write("\t\t\t<div class=\"grid mt10\">\r\n");
      out.write("            \t<table class=\"tb-noBorder\">\r\n");
      out.write("                \t<colgroup>\r\n");
      out.write("                      \t<col style=\"width:110px\">\r\n");
      out.write("                      \t<col style=\"width:auto\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    \t<tr>\r\n");
      out.write("                        \t<th>면허구분</th>\r\n");
      out.write("                        \t<td>\r\n");
      out.write("                        \t <select name=\"licenseNo\">\t\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"국내\">국내</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"국제\">국제</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("                        \t</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>면허 종류</th>\r\n");
      out.write("                            <td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"licenseKind\">\t\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"\">선택</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"1종대형\">1종대형</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"1종보통\">1종보통</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"2종보통\">2종보통</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"2종오토\">2종오토</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("                        \t<th>면허증 번호</th>\r\n");
      out.write("                        \t<td>               \r\n");
      out.write("                           \t<select name=\"licenseNo1\" style=\"width: 90px;\">\t\r\n");
      out.write("                           \t\t<option value=\"\">선택</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"대구\">대구</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"인천\">인천</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"광주\">광주</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"대전\">대전</option>\r\n");
      out.write("\t\t    \t\t\t\t\t<option value=\"울산\">울산</option>\r\n");
      out.write("\t\t    \t\t\t\t</select>\t\t\r\n");
      out.write("                           \t<span class=\"hyphen\"> - </span>\r\n");
      out.write("                            <input  type=\"text\" name=\"licenseNo2\" title=\"면허증번호 두번째 숫자\" style=\"width:60px;\" value=\"\" maxlength=\"2\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                            <span class=\"hyphen\"> - </span>\r\n");
      out.write("                            <input  type=\"text\" name=\"licenseNo3\" title=\"면허증번호 세번째 숫자\" style=\"width:90px;\" value=\"\" maxlength=\"6\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                           \t<span class=\"hyphen\"> - </span>\r\n");
      out.write("                            <input  type=\"text\" name=\"licenseNo4\" title=\"면허증번호 마지막 숫자\" style=\"width:60px;\" value=\"\" maxlength=\"2\" onkeydown=\"\" onkeypress=\"\" onkeyup=\"\">\r\n");
      out.write("                           </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("                        \t<th>발급일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateY\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"licenseAcqYYYY\" title=\"면허발급일자 첫번째 숫자\" placeholder=\"YYYY\" style=\"width:90px;ime-mode:disabled; \" onkeydown=\"\" type=\"text\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>년</span>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateM\">\t\t\t\t\t\t\t\r\n");
      out.write("                                \t<input name=\"licenseAcqMM\" title=\"면허발급일자 두번째 숫자\" placeholder=\"MM\" class=\"ml20\" style=\"width:60px;ime-mode:disabled; \" onkeydown=\"\" type=\"text\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"2\">\r\n");
      out.write("                                \t<span>월</span> \r\n");
      out.write("                                \t </div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateD\">\t                           \t\r\n");
      out.write("                                \t<input name=\"licenseAcqDD\" title=\"면허발급일자 세번째 숫자\" placeholder=\"DD\" class=\"ml20\" style=\"width:60px;ime-mode:disabled; \" onkeydown=\"\" type=\"password\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"2\">\r\n");
      out.write("                                \t<span>일</span>\r\n");
      out.write("                                \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("                        \t<th>만료일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateY\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"licenseAcqYYYY\" title=\"면허발급일자 첫번째 숫자\" placeholder=\"YYYY\" style=\"width:90px;ime-mode:disabled; \" onkeydown=\"\" type=\"text\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>년</span>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateM\">\t\t\t\t\t\t\t\r\n");
      out.write("                                \t<input name=\"licenseAcqMM\" title=\"면허발급일자 두번째 숫자\" placeholder=\"MM\" class=\"ml20\" style=\"width:60px;ime-mode:disabled; \" onkeydown=\"\" type=\"text\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"2\">\r\n");
      out.write("                                \t<span>월</span> \r\n");
      out.write("                                \t </div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"licenseDateD\">\t                           \t\r\n");
      out.write("                                \t<input name=\"licenseAcqDD\" title=\"면허발급일자 세번째 숫자\" placeholder=\"DD\" class=\"ml20\" style=\"width:60px;ime-mode:disabled; \" onkeydown=\"\" type=\"password\" value=\"\" onkeypress=\"\" onkeyup=\"\" maxlength=\"2\">\r\n");
      out.write("                                \t<span>일</span>\r\n");
      out.write("                                \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                   </tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<p class=\"hg-30\"></p>\r\n");
      out.write("\t\t\t<label class=\"option-right-hr f15\">예약완료를 위한 이용자 동의 사항</label>\r\n");
      out.write("\t\t\t<!-- div 예약완료를 위한 이용 동의 -->\r\n");
      out.write("\t\t\t<div class=\"user-agreement\">\r\n");
      out.write("            \t<p>\r\n");
      out.write("                \t<input type=\"checkbox\" id=\"agreeNM1\" name=\"agreeChk1\">\r\n");
      out.write("                    <label for=\"agreeNM1\" class=\"mr15\"><span class=\"icon\"></span>예약완료를 위한 이용 동의(필수)</label>\r\n");
      out.write("                </p>\r\n");
      out.write("                <div class=\"box scroll\">\r\n");
      out.write("                \t<p>제 1장(총칙) </p>\r\n");
      out.write("                    \t<ul class=\"txt-list\">\r\n");
      out.write("                        \t<li class=\"black f14\">대여자격\r\n");
      out.write("                            \t<ul class=\"txt-list\">\r\n");
      out.write("                                \t<li class=\"check f13\">소/중형/7/9인승 승합차 - 만 21세 이상, 운전경력 1년 이상</li>\r\n");
      out.write("                                    <li class=\"check f13\">10인승 이상 승합차 - 만 21세 이상, 운전경력 1년 이상</li>\r\n");
      out.write("                                    <li class=\"check f13\">운전면허 적성검사 유효기간이 대여기간 內 남아있어야 대여가 가능함</li>\r\n");
      out.write("                                    <li class=\"check f13\">제 2운전자 등록을 원하실 경우 차량 픽업시 운전면허증을 지참하시어 동행하신 경우에 한해 등록이 가능함</li>\r\n");
      out.write("                                    <li class=\"check f13\">외국인일 경우 본인확인을 위한 여권 및 국제운전면허증 필수 지참</li>\r\n");
      out.write("                                    <li class=\"check f13\"><span class=\"txt-point\">차량운전자가 위의 대여자격조건에 맞지 않을 경우 현장에서 차량인수가 불가할 수도 있으니 필히 대여자격을 확인해 주시기 바랍니다.</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                            <li class=\"black f14\">운전면허\r\n");
      out.write("                                <ul class=\"txt-list\">\r\n");
      out.write("                                   <li class=\"check f13\">운전면허증<strong>(차량인수시 필히 지참)</strong>\r\n");
      out.write("                                       <ul class=\"txt-list\">\r\n");
      out.write("                                            <li class=\"bul\">도로교통법상 유효한 운전면허소지자</li>\r\n");
      out.write("                                       </ul>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li class=\"check f13\">외국인일 경우 국제운전면허증 소지자(B등급 이상 - 9인승 이하차량만 대여가능)\r\n");
      out.write("                                   </li>\r\n");
      out.write("                               </ul>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li class=\"black f14\">보험\r\n");
      out.write("                           \t\t<ul class=\"txt-list\">\r\n");
      out.write("                           \t\t\t<li class=\"check f13\">전 차량 자동차 종합보험(대인,대물,자손)에 가입되어 있으며 자차손해 면책제도(CDW)는 선택 사항으로 차량인수시 해당지점에서 추가로 가입이 가능합니다.\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li class=\"black f14\">결제 조건\r\n");
      out.write("                                <ul class=\"txt-list\">\r\n");
      out.write("                                    <li class=\"check f13\">대여요금 결제시에는 신용카드 결제(임차인 본인신용카드)를 우선하며, 현금결제시에는 신용 정보조회 후 이상이 없는 경우에만 차량대여가 가능합니다.</li>\r\n");
      out.write("                                    <li class=\"check f13\">차량예약 후에도 신용정보조회시 불량거래 내역등이 있을 경우 현장에서 차량대여가   불가능 할 수도 있습니다.</li>\r\n");
      out.write("                                    <li class=\"check f13\"><strong>신용정보조회는 고객님의 동의하에 가능하며, 신용정보조회시 고객님의 금용거래 등에    영향을 미칠 수 있습니다.</strong></li>\r\n");
      out.write("                                    <li class=\"check f13\"><span class=\"txt-point\">사전 연락없이 예약시간까지 지점에 방문하지 않으실 경우, 예약이 취소됩니다.</span></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                           </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <!-- /div 예약완료를 위한 이용 동의 -->\r\n");
      out.write("             <!-- div 차량 대여를 위한 개인정보 수집 -->\r\n");
      out.write("             <p class=\"hg-15\"></p>\r\n");
      out.write("             <div class=\"user-agreement\">\r\n");
      out.write("            \t<p>\r\n");
      out.write("                \t<input type=\"checkbox\" id=\"agreeNM2\" name=\"agreeChk2\">\r\n");
      out.write("                \t<label for=\"agreeNM2\" class=\"mr15\"><span class=\"icon\"></span>차량 대여를 위한 개인정보 수집 / 이용 동의(필수)</label>\r\n");
      out.write("            \t</p>\r\n");
      out.write("            \t<div class=\"box scroll\">\r\n");
      out.write("            \t\t<p></p>\r\n");
      out.write("            \t\t<ul class=\"txt-list\">\r\n");
      out.write("            \t\t\t<li class=\"black f14\"><span class=\"f120 underline\">개인정보의 수집 및 이용 목적 </span>\r\n");
      out.write("\t\t\t\t\t    \t<ul class=\"txt-list\">               \r\n");
      out.write("\t\t\t\t\t        \t<li class=\"check f120\">렌터카 예약서비스 이용</li>\r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t\t   </li>\r\n");
      out.write("\t\t\t\t\t   <p class=\"hg-10\"></p>\r\n");
      out.write("\t\t\t\t\t   <li class=\"black f14\"><span class=\"f120 underline\">개인정보 수집 항목 </span>\r\n");
      out.write("\t\t\t\t\t   \t\t<ul class=\"txt-list\">               \r\n");
      out.write("\t\t\t\t\t        \t<li class=\"check f120\">성명, 생년월일, 성별, 이메일주소, 휴대전화번호</li>\r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t\t   </li>\r\n");
      out.write("\t\t\t\t\t   <p class=\"hg-10\"></p>\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   <li class=\"black f14\"><span class=\"f120 underline\">개인정보 이용 및 보유 기간</span>\r\n");
      out.write("\t\t\t\t\t   \t\t<ul class=\"txt-list\">               \r\n");
      out.write("\t\t\t\t\t        \t<li class=\"check f12 f120\">이용자가 제공한 개인정보는 렌터카 서비스 이용 종료 후 5년간 회사가 보유 이용하게 됩니다.</li>\r\n");
      out.write("\t\t\t\t\t            <li class=\"check f13\"><span class=\"txt-point\">동의 체크박스에 클릭할 경우, 개인정보 수집/이용 동의에 동의한 것으로 간주합니다.</span></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t\t   </li>\r\n");
      out.write("            \t\t</ul>            \t\t\r\n");
      out.write("            \t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /div 차량 대여를 위한 개인정보 수집 -->\r\n");
      out.write("            <!-- div 고유식별정보 수집에 대한 동의 -->\r\n");
      out.write("            <p class=\"hg-15\"></p>\r\n");
      out.write("            <div class=\"user-agreement\">\r\n");
      out.write("               <p>\r\n");
      out.write("                \t<input type=\"checkbox\" id=\"agreeNM3\" name=\"agreeChk3\">\r\n");
      out.write("                \t<label for=\"agreeNM3\" class=\"mr15\"><span class=\"icon\"></span>고유식별정보 수집에 대한 동의(필수)</label>\r\n");
      out.write("            \t</p>\r\n");
      out.write("            \t<div class=\"sbox scroll\">      \r\n");
      out.write("            \t\t<ul class=\"txt-list\">\r\n");
      out.write("            \t\t\t<li class=\"check f13\">수집하는 고유식별정보 항목 : 운전면허번호</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"check f13\">수집 및 이용 목적 : 보험 조건 등 렌터카 대여 조건 확인</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"check f13\">보유 및 이용 기간 : 렌터카 서비스 이용 종료 후 5년간</li>\t\t\t\t\t\t\r\n");
      out.write("            \t\t</ul>\r\n");
      out.write("            \t</div>\t\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- div 고유식별정보 수집에 대한 동의 -->\r\n");
      out.write("            <p class=\"hg-10\"></p>\r\n");
      out.write("\t\t\t<div class=\"optionBtn\">\r\n");
      out.write("\t\t\t\t<button class=\"btn-default-cancel btn-prev\" onclick=\"goLinkPage('");
      out.print(contextPath);
      out.write("/carOption.rv');\">이전</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn-default-ok btn-next\" onclick=\"goLinkPage('");
      out.print(contextPath);
      out.write("/carPayment.rv');\">다음</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t<!-- /div car-info-right -->\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p class=\"hg-30\"></p>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/resources/js/reservation/reservation.js\"></script>  \r\n");
      out.write("\r\n");
      out.write("</body>\t\r\n");
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