/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.86
 * Generated at: 2024-05-11 15:46:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.finProj;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import finProj_flight.findResultDo;
import java.util.ArrayList;
import org.w3c.dom.Document;
import java.time.LocalDate;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/finProj/find.jsp", Long.valueOf(1715442400000L));
    _jspx_dependants.put("/finProj/nav.jsp", Long.valueOf(1686533860000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("org.w3c.dom.Document");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.time.LocalDate");
    _jspx_imports_classes.add("finProj_flight.findResultDo");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("th{\r\n");
      out.write("	text-align: center!important;\r\n");
      out.write("}\r\n");
      out.write("tr {\r\n");
      out.write("	display: flex;\r\n");
      out.write("}\r\n");
      out.write("td {\r\n");
      out.write("	display: flex;\r\n");
      out.write("    justify-content: space-evenly;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write("td > img {\r\n");
      out.write("	height:15px;\r\n");
      out.write("}\r\n");
      out.write(".navbar-brand {\r\n");
      out.write("	padding-top: 1rem!important;\r\n");
      out.write("    padding-bottom: 1rem!important;\r\n");
      out.write("}\r\n");
      out.write(".navbar-brand .input-group-text{\r\n");
      out.write("    font-size: 1.25rem!important;\r\n");
      out.write("    line-height: 2!important;\r\n");
      out.write("    color: #ffffff!important;\r\n");
      out.write("    background-color: transparent!important;\r\n");
      out.write("}\r\n");
      out.write(".navbar-brand .input-group {\r\n");
      out.write("	margin : 0;\r\n");
      out.write("}\r\n");
      out.write(".navbar-brand input.form-control {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("        width: 120px!important;\r\n");
      out.write("}\r\n");
      out.write(".form-control:disabled, .form-control[readonly] {\r\n");
      out.write("    background-color: #ffffff!important;\r\n");
      out.write("    color:#0d6efd!important;\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\" style=\"margin-bottom : 200px\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".btn-outline-light:hover{\r\n");
      out.write("    color: #0d6efd !important ;\r\n");
      out.write("}\r\n");
      out.write("/* point-color : #E3F321*/\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("utf-8");
	String logout = request.getParameter("logout");

	//logout 변수에 값이 있으면, 리셋
	if(logout != null) {
		session.setAttribute("userid", null);	
		session.setAttribute("username", null);	
		session.setAttribute("countryfrom", null);
		session.setAttribute("countryto", null);
		session.setAttribute("datefrom", null);
		session.setAttribute("dateto", null);
		Cookie[] ck = request.getCookies();
		try{
			for(int i=0; i< ck.length; i++){
				ck[i].setMaxAge(0);
				response.addCookie(ck[i]);
			}
		}catch (Exception e) {
			out.print("쿠키가 사라지지 않았습ㄴ디ㅏ");
		}
	}
	 
	String username = (String)session.getAttribute("username");
	if(username == null) {
		username = " ";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- <a class=\"navbar-brand\" href=\"#\">Navbar</a> -->\r\n");
      out.write("    \r\n");
      out.write("    <a class=\"navbar-brand\" href=\"./main.jsp\">\r\n");
      out.write("      <img src=\"./assets/trip1.png\" alt=\"\" width=\"35\" class=\"d-inline-block align-text-top\">\r\n");
      out.write("      JSP FLIGHTS\r\n");
      out.write("    </a>\r\n");
      out.write("    \r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"./main.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("        </li> -->\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- <form class=\"d-flex\">\r\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("      </form> -->\r\n");
      out.write("      ");

      	if(username.equals(" ")){
	
      out.write("\r\n");
      out.write("			<input class=\"btn btn-outline-light\" type=\"button\" value=\"로그인\" onclick=\"location.href='loginFormBoot.jsp'\" style=\"margin-left: 20px;\"> \r\n");
      out.write("			<input class=\"btn btn-outline-light\" type=\"button\" value=\"회원가입\" onclick=\"location.href='registerFormBoot.jsp'\" style=\"margin-left: 20px;\"> \r\n");
      out.write("	");

      	} else {
	
      out.write("\r\n");
      out.write("      		<div style=\"color:white;display: flex;\">\r\n");
      out.write("      		<div class=\"dropdown\">\r\n");
      out.write("			  <button class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("			    ");
      out.print(username );
      out.write(" 님\r\n");
      out.write("			  </button>\r\n");
      out.write("			  <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"myInfo.jsp\">내 정보</a></li>\r\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"myReservation.jsp\">내 예약</a></li>\r\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"main.jsp?logout=1\">로그아웃</a></li>\r\n");
      out.write("			  </ul>\r\n");
      out.write("			</div>\r\n");
      out.write("      			<input class=\"btn btn-outline-light\" type=\"button\" value=\"로그아웃\" onclick=\"location.href='main.jsp?logout=1'\" style=\"margin-left: 20px;\"> \r\n");
      out.write("      		</div>\r\n");
      out.write("      		\r\n");
      out.write("	");

      	}
      
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("		");
      finProj_flight.findResultDo rdo = null;
      rdo = (finProj_flight.findResultDo) _jspx_page_context.getAttribute("rdo", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (rdo == null){
        rdo = new finProj_flight.findResultDo();
        _jspx_page_context.setAttribute("rdo", rdo, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write("\r\n");
        out.write("			");
        org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("rdo"), request);
        out.write("\r\n");
        out.write("		");
      }
      out.write("\r\n");
      out.write("		");
      finProj_flight.findResultDao rdao = null;
      rdao = (finProj_flight.findResultDao) _jspx_page_context.getAttribute("rdao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (rdao == null){
        rdao = new finProj_flight.findResultDao();
        _jspx_page_context.setAttribute("rdao", rdao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".input-group {\r\n");
      out.write("	margin: 30px 0;\r\n");
      out.write("}\r\n");
      out.write(".mb-3 > .border-primary {\r\n");
      out.write("	border-color:#86b7fe!important;\r\n");
      out.write("}\r\n");
      out.write(".form-control{\r\n");
      out.write("	margin-right:10px;\r\n");
      out.write("}\r\n");
      out.write(".form-control:focus {\r\n");
      out.write("    box-shadow: none!important;\r\n");
      out.write("}\r\n");
      out.write(".btn-check:focus+.btn, .btn:focus, .btn-check:focus+.btn-outline-secondary, .btn-outline-secondary:focus, .btn-check:checked+.btn-outline-secondary:focus {\r\n");
      out.write("box-shadow: none!important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"checkradio()\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function checkradio() {\r\n");
      out.write("		let sort = ");
      out.print((String)session.getAttribute("sort"));
      out.write("\r\n");
      out.write("		if(sort == null) {\r\n");
      out.write("			let radiobtn = document.getElementById(\"takeofftime\");\r\n");
      out.write("			radiobtn.checked=true;\r\n");
      out.write("		} else {\r\n");
      out.write("			//console.log(sort.value);\r\n");
      out.write("			if( sort == \"takeofftime\"){\r\n");
      out.write("				let radiobtn = document.getElementById(sort.value);\r\n");
      out.write("				radiobtn.checked=true;\r\n");
      out.write("			}else if( sort == \"airlinename\"){\r\n");
      out.write("				let radiobtn = document.getElementById(sort.value);\r\n");
      out.write("				radiobtn.checked=true;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<p> 2023/07 ~ 2023/08 일부 항공사만 가능</p>\r\n");
      out.write("\r\n");

	LocalDate now = LocalDate.now();
	String ctryfrom = (String)session.getAttribute("countryfrom");
	String ctryto = (String)session.getAttribute("countryto");
	String dfrom = (String)session.getAttribute("datefrom");
	String dto = (String)session.getAttribute("dateto");
	if (ctryfrom == null) {
		ctryfrom = "";
	}
	if (ctryto == null) {
		ctryto = "";
	}
	if (dfrom == null) {
		dfrom = now.toString();		
	}
	if (dto == null) {
		dto = dfrom;		
	}

      out.write("\r\n");
      out.write("	<form action=\"./findProc.jsp\" method=\"post\" style=\"margin-bottom:30px; padding:10px\">\r\n");
      out.write("		<div class=\"input-group mb-3\">		\r\n");
      out.write("		  	<label class=\"input-group-text bg-primary p-2 text-dark bg-opacity-10 border border-primary\" style=\"border-bottom-left-radius: 10px!important;border-top-left-radius: 10px!important;\" for=\"countryfrom\">출발지</label>\r\n");
      out.write("		  	<input type=\"text\" list=\"country-airport\" class=\"form-control border border-primary\" id=\"countryfrom\" placeholder=\"국가 또는 공항\"  style=\"text-transform: uppercase;\" name=\"countryfrom\" value=\"");
      out.print(ctryfrom);
      out.write("\"> \r\n");
      out.write("		  	<datalist id=\"country-airport\">\r\n");
      out.write("		    	");

					try{
						String id = "root";
						String password = "111111";
						String url = "jdbc:mysql://localhost:3306/jspdb_3315?characterEncoding=utf-8";
						
						Connection conn = null;
						PreparedStatement pstmt = null;
						ResultSet rs = null;
						//2. DB 연결
						conn = DriverManager.getConnection(url,id, password);
						
						//3. SQL문 완성
						String sql = "select * from country, airport where airport.country=country.countryname_en";
						pstmt = conn.prepareStatement(sql);
						
						//4. SQL문 실행(전송)
						rs = pstmt.executeQuery();
						int i = 1;
						while(rs.next()){
					
      out.write("		<option value=\"");
      out.print(rs.getString(4) );
      out.write("\" label=\"");
      out.print( rs.getString(2) );
      out.write(',');
      out.write(' ');
      out.print( rs.getString(3) );
      out.write(',');
      out.write(' ');
      out.print(rs.getString(7) );
      out.write(',');
      out.write(' ');
      out.print(rs.getString(8) );
      out.write("\" />\r\n");
      out.write("							");

							i++;
						}
						conn.close();
						pstmt.close();
						rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				
      out.write("\r\n");
      out.write("		  </datalist>\r\n");
      out.write("		  	<label class=\"input-group-text bg-primary p-2 text-dark bg-opacity-10 border border-primary\" for=\"countryto\">도착지</label>\r\n");
      out.write("		  	<input type=\"text\" list=\"country-airport\" class=\"form-control border border-primary\" id=\"countryto\" placeholder=\"국가 또는 공항\"  style=\"text-transform: uppercase;\" name=\"countryto\"  value=\"");
      out.print(ctryto);
      out.write("\"> \r\n");
      out.write("		  	<datalist id=\"country-airport\">\r\n");
      out.write("		    	");

					try{
						String id = "root";
						String password = "111111";
						String url = "jdbc:mysql://localhost:3306/jspdb_3315?characterEncoding=utf-8";
						
						Connection conn = null;
						PreparedStatement pstmt = null;
						ResultSet rs = null;
						//2. DB 연결
						conn = DriverManager.getConnection(url,id, password);
						
						//3. SQL문 완성
						String sql = "select * from country, airport where airport.country=country.countryname_en";
						pstmt = conn.prepareStatement(sql);
						
						//4. SQL문 실행(전송)
						rs = pstmt.executeQuery();
						int i = 1;
						while(rs.next()){
					
      out.write("		<option value=\"");
      out.print(rs.getString(4) );
      out.write("\" label=\"");
      out.print( rs.getString(2) );
      out.write(',');
      out.write(' ');
      out.print( rs.getString(3) );
      out.write(',');
      out.write(' ');
      out.print(rs.getString(7) );
      out.write(',');
      out.write(' ');
      out.print(rs.getString(8) );
      out.write("\" />\r\n");
      out.write("							");

							i++;
						}
						conn.close();
						pstmt.close();
						rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				
      out.write("\r\n");
      out.write("		  </datalist>\r\n");
      out.write("		  <span class=\"input-group-text bg-primary p-2 text-dark bg-opacity-10 border border-primary\" id=\"datefrom\">가는편</span>\r\n");
      out.write("		  \r\n");
      out.write("		  <input type=\"date\" class=\"form-control border border-primary\" id=\"datefrom\" name=\"datefrom\"  value=\"");
      out.print(dfrom );
      out.write("\" min=\"\" maxlength=\"10\">\r\n");
      out.write("		  <span class=\"input-group-text bg-primary p-2 text-dark bg-opacity-10 border border-primary\" id=\"dateto\">오는편</span>\r\n");
      out.write("		  <input type=\"date\" class=\"form-control border border-primary\"  value=\"");
      out.print(dto );
      out.write("\" min=\"\" id=\"dateto\" name=\"dateto\" style=\"border-bottom-right-radius: 10px!important;border-top-right-radius: 10px!important;\">	\r\n");
      out.write("		  \r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"btn-group btn-group-sm float-end\" role=\"group\" aria-label=\"Basic radio toggle button group\">\r\n");
      out.write("		  <input type=\"radio\" class=\"btn-check\" value=\"takeofftime\" name=\"sort\" id=\"takeofftime\">\r\n");
      out.write("		  <label class=\"btn btn-outline-primary\" for=\"takeofftime\" style=\"height:30px\">이른출발순</label>\r\n");
      out.write("		\r\n");
      out.write("		  <input type=\"radio\" class=\"btn-check\" value=\"airlinename\" name=\"sort\" id=\"airlinename\" >\r\n");
      out.write("		  <label class=\"btn btn-outline-primary\" for=\"airlinename\" style=\"height:30px\">항공사순</label>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"d-grid gap-2 col-6 mx-auto\">\r\n");
      out.write("	  		<button class=\"btn btn-primary\" type=\"submit\">항공권 찾기</button>\r\n");
      out.write("	  	</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("		");

			String sort = (String)session.getAttribute("sort");
		
      out.write("\r\n");
      out.write("		<div class=\"fw-bolder fs-3\" style=\"display: flex;justify-content: space-between;align-items: flex-end;margin-bottom:20px\">[ 출국편 ]\r\n");
      out.write("		</div>\r\n");
      out.write("		<table border=\"1\" class=\"table table-hover\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 항공사 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 편명 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 출발 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 도착 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 비행시간 </th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");

		ArrayList<findResultDo> aList = rdao.getFlights(rdo.getCountryfrom().toUpperCase(),rdo.getCountryto().toUpperCase(),rdo.getDatefrom(),sort);
		ArrayList<findResultDo> bList = rdao.getFlights(rdo.getCountryto().toUpperCase(),rdo.getCountryfrom().toUpperCase(), rdo.getDateto(),sort);
		for(int i = 0; i< aList.size(); i++) {
			findResultDo rTemp = aList.get(i);
			String imgurl = "";
			if (rTemp.getAirline().equals("ASIANA")){
				imgurl = "assets/asianaair.png";
			} else if (rTemp.getAirline().equals("KOREANAIR")){
				imgurl = "assets/koreanair.png";
			} else if (rTemp.getAirline().equals("JEJUAIR")){
				imgurl = "assets/jejuair.png";
			} else if (rTemp.getAirline().equals("CEBUAIR")){
				imgurl = "assets/cebuair.png";
			} else if (rTemp.getAirline().equals("PHILIPPINE")){
				imgurl = "assets/philippineair.png";
			}

      out.write("\r\n");
      out.write("			<tr height=\"60\" align=\"center\" onclick=\"location.href='flightInfo.jsp?flightno=");
      out.print(rTemp.getFlightno());
      out.write("&flightdate=");
      out.print( rTemp.getFlightdate() );
      out.write("'\">\r\n");
      out.write("				<td width=\"20%\"> <img src=\"");
      out.print(imgurl );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print( rTemp.getAirline() );
      out.write("</td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print(rTemp.getFlightairline() );
      out.write(' ');
      out.print(rTemp.getFlightno() );
      out.write(" </td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print( rTemp.getFlightfrom() );
      out.write("</td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print( rTemp.getFlightto() );
      out.write(" </td>\r\n");
      out.write("				<td width=\"20%\"> \r\n");
      out.write("				");
      out.print(rTemp.getFlightdate() );
      out.write(" <br> ");
      out.print( rTemp.getTakeofftime() );
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print(rTemp.getLandingtime() );
      out.write(" </td>\r\n");
      out.write("				\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("		");

		}
	
      out.write("</tbody></table>\r\n");
      out.write("	\r\n");
      out.write("	<br><br><br>\r\n");
      out.write("		<div class=\"fw-bolder fs-3\" style=\"display: flex;justify-content: space-between;align-items: flex-end;margin-bottom:20px\">[ 귀국편 ]\r\n");
      out.write("		</div>\r\n");
      out.write("		<table border=\"1\" class=\"table table-hover\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 항공사 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 편명 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 출발 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 도착 </th>\r\n");
      out.write("					<th width=\"20%\" scope=\"col\"> 비행시간 </th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");

		for(int i = 0; i< bList.size(); i++) {
			findResultDo rTemp = bList.get(i);
			String imgurl = "";
			if (rTemp.getAirline().equals("ASIANA")){
				imgurl = "assets/asianaair.png";
			} else if (rTemp.getAirline().equals("KOREANAIR")){
				imgurl = "assets/koreanair.png";
			} else if (rTemp.getAirline().equals("JEJUAIR")){
				imgurl = "assets/jejuair.png";
			} else if (rTemp.getAirline().equals("CEBUAIR")){
				imgurl = "assets/cebuair.png";
			} else if (rTemp.getAirline().equals("PHILIPPINE")){
				imgurl = "assets/philippineair.png";
			}

      out.write("\r\n");
      out.write("			<tr height=\"60\" align=\"center\" onclick=\"location.href='flightInfo.jsp?flightno=");
      out.print(rTemp.getFlightno());
      out.write("&flightdate=");
      out.print( rTemp.getFlightdate() );
      out.write("'\">\r\n");
      out.write("				<td width=\"20%\"> <img src=\"");
      out.print(imgurl );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print( rTemp.getAirline() );
      out.write("</td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print(rTemp.getFlightairline() );
      out.write(' ');
      out.print(rTemp.getFlightno() );
      out.write(" </td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print( rTemp.getFlightfrom() );
      out.write("</td>\r\n");
      out.write("				<td width=\"20%\"> ");
      out.print(rTemp.getFlightto() );
      out.write(" </td>\r\n");
      out.write("				<td width=\"20%\"> \r\n");
      out.write("				");
      out.print(rTemp.getFlightdate() );
      out.write(" <br> ");
      out.print(rTemp.getTakeofftime() );
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print(rTemp.getLandingtime() );
      out.write(" </td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		");

		}
	
      out.write("</tbody></table>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

		Cookie[] cookies = request.getCookies();
		String goflightno = "";
		String goflightdate = "";
		String goflightairline = "";
		String backflightno = "";
		String backflightdate = "";
		String backflightairline = "";
		
		//if((String)request.getParameter("flightdate") != null){
	//	}
		if (cookies != null) {
			for(int i=0; i< cookies.length; i++){
				if(cookies[i].getName().toString().equals("goflightno")){
					goflightno = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("goflightdate")){
					goflightdate = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("goflightairline")){
					goflightairline = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightno")){
					backflightno = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightdate")){
					backflightdate = cookies[i].getValue();
					continue;
				} else if(cookies[i].getName().toString().equals("backflightairline")){
					backflightairline = cookies[i].getValue();
					continue;
				}
			}
		}

		String fdate = (String)request.getParameter("flightdate");
		String fno = (String)request.getParameter("flightno");
		String fline = (String)request.getParameter("flightairline");
		if (fdate != null){
			if (fdate.equals(rdo.getDatefrom())){
				goflightno = fno;
				goflightdate = fdate;
				goflightairline = fline;
			} else if (fdate.equals(rdo.getDateto())){
				backflightno = fno;
				backflightdate = fdate;
				backflightairline = fline;
			}
		} 
		
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<nav class=\"navbar fixed-bottom navbar-dark bg-primary\">\r\n");
      out.write("	\r\n");
      out.write("	  <div class=\"container-fluid\" style=\"justify-content: space-evenly!important;\">\r\n");
      out.write("	    <div class=\"navbar-brand\"> \r\n");
      out.write("	    	<div class=\"input-group\">\r\n");
      out.write("			  <span class=\"input-group-text\">출국편</span>\r\n");
      out.write("			  <input name=\"goflightdate\" value=\"");
      out.print( goflightdate );
      out.write("\" class=\"form-control\" style=\"margin:0\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			  <input name=\"goflightairline\" value=\"");
      out.print( goflightairline );
      out.write("\" class=\"form-control\" style=\"margin:0;width:50px!important\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			  <input name=\"goflightno\" value=\"");
      out.print( goflightno );
      out.write("\" class=\"form-control\" style=\"margin:0;width:100px!important\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			</div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <div class=\"navbar-brand\"> \r\n");
      out.write("	    	<div class=\"input-group\">\r\n");
      out.write("			  <span class=\"input-group-text\">귀국편</span>\r\n");
      out.write("			  <input name=\"backflightdate\" value=\"");
      out.print( backflightdate );
      out.write("\" class=\"form-control\" style=\"margin:0\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			  <input name=\"backflightairline\" value=\"");
      out.print( backflightairline );
      out.write("\" class=\"form-control\" style=\"margin:0;width:50px!important\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			  <input name=\"backflightno\" value=\"");
      out.print( backflightno );
      out.write("\" class=\"form-control\" style=\"margin:0;width:100px!important\" type=\"text\" aria-label=\"Disabled input example\" disabled readonly>\r\n");
      out.write("			</div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	    ");

	    	String userid="" ; 
	    	if((String)session.getAttribute("userid") != null) {
	    		userid = (String)session.getAttribute("userid"); 
	    	}
	    	String url= "";
		  	
			if(userid != "") {
				url = "location.href='reservation.jsp'";
			}
			else {
				url = "location.href='loginFormBoot.jsp'";
			}
	    
      out.write("\r\n");
      out.write("		<input type=\"submit\" class=\"btn btn-outline-light input-group input-group-lg\" style=\"width:120px;line-height: 2;font-size: 1.25rem;margin:0\" onclick=\"");
      out.print(url );
      out.write("\" value=\"예약하기\"></input>\r\n");
      out.write("	  </div>\r\n");
      out.write("	  \r\n");
      out.write("	</nav>\r\n");
      out.write("	\r\n");
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
