/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.86
 * Generated at: 2023-06-12 01:41:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.finProj;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerFormBoot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/finProj/nav.jsp", Long.valueOf(1686533860000L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".form-control:focus {\r\n");
      out.write("	box-shadow: none!important;\r\n");
      out.write("}\r\n");
      out.write(".agree {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("#useragree {\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write(".agree:after {display:block; clear:both; content:\"\";}\r\n");
      out.write(".agree input[type=\"checkbox\"] {\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write(".agree input[type=\"checkbox\"] + label { \r\n");
      out.write("    width:15px; \r\n");
      out.write("    height: 15px; \r\n");
      out.write("    background: #fff; \r\n");
      out.write("    border: 1px solid #d9d9d9;\r\n");
      out.write("    cursor: pointer; \r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    float: left;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".agree input[type=\"checkbox\"]:checked + label {\r\n");
      out.write("    background: #0d6efd no-repeat center/10px 10px; \r\n");
      out.write("    float: left\r\n");
      out.write("}\r\n");
      out.write(".agree input[type=\"checkbox\"] + label span {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    padding-left: 30px;\r\n");
      out.write("    display: block; \r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
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
      out.write("<div cass=\"container\">\r\n");
      out.write("	<div class=\"container\" style=\"max-width: 700px; margin-bottom : 100px; border-radius: 5px;padding: 50px 20px;\">\r\n");
      out.write("		<p class=\"text-start fs-1 fw-bold\" style=\"display: flex;justify-content: center; mrgin-bottom:0;margin-top:16px;\">회원가입</p>\r\n");
      out.write("		\r\n");
      out.write("		<form action=\"registerProcBoot.jsp\" method=\"post\" style=\"display: flex;height: 80%;flex-direction: column; justify-content: space-evenly;\">\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"userid\" class=\"form-label fw-bold fs-4\">아이디</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"userid\" name=\"userid\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"userpw\" class=\"form-label fw-bold fs-4\">비밀번호</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"userpw\" name=\"userpw\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"username\" class=\"form-label fw-bold fs-4\">이름</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"usercountry\" class=\"form-label fw-bold fs-4\">국가</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"usercountry\" name=\"usercountry\" style=\"text-transform: uppercase; \" placeholder=\"KOREA\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"userbirth\" class=\"form-label fw-bold fs-4\">생년월일</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"userbirth\" name=\"userbirth\" placeholder=\"YYYY-MM-DD\" maxlength=\"10\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<script type=\"text/javascript\">\r\n");
      out.write("				let autoBirth = function(str){\r\n");
      out.write("				      str = str.replace(/[^0-9]/g, '');\r\n");
      out.write("				      let tmp = '';\r\n");
      out.write("				      if( str.length < 5){\r\n");
      out.write("				          return str;\r\n");
      out.write("				      }else if(str.length < 7){\r\n");
      out.write("				          tmp += str.substr(0, 4);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(4);\r\n");
      out.write("				          return tmp;\r\n");
      out.write("				      }else{              \r\n");
      out.write("				          tmp += str.substr(0, 4);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(4, 2);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(6);\r\n");
      out.write("				          return tmp;\r\n");
      out.write("				      }\r\n");
      out.write("				  \r\n");
      out.write("				      return str;\r\n");
      out.write("				}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("				let userbirth = document.getElementById('userbirth');\r\n");
      out.write("	\r\n");
      out.write("				userbirth.onkeyup = function(){\r\n");
      out.write("				  console.log(this.value);\r\n");
      out.write("				  this.value = autoBirth( this.value ) ;  \r\n");
      out.write("				}\r\n");
      out.write("			</script>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"useremail\" class=\"form-label fw-bold fs-4\">이메일</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" id=\"useremail\" name=\"useremail\" placeholder=\"someone@example.com\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			  <label for=\"usertel\" class=\"form-label fw-bold fs-4\">전화번호</label>\r\n");
      out.write("			  <input type=\"text\" class=\"form-control\" maxlength=\"13\" id=\"usertel\" name=\"usertel\" placeholder=\"숫자만 입력하세요.\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<script type=\"text/javascript\">\r\n");
      out.write("				let autoTel = function(str){\r\n");
      out.write("				      str = str.replace(/[^0-9]/g, '');\r\n");
      out.write("				      let tmp = '';\r\n");
      out.write("				      if( str.length < 4){\r\n");
      out.write("				          return str;\r\n");
      out.write("				      }else if(str.length < 7){\r\n");
      out.write("				          tmp += str.substr(0, 3);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(3);\r\n");
      out.write("				          return tmp;\r\n");
      out.write("				      }else if(str.length < 11){\r\n");
      out.write("				          tmp += str.substr(0, 3);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(3, 3);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(6);\r\n");
      out.write("				          return tmp;\r\n");
      out.write("				      }else{              \r\n");
      out.write("				          tmp += str.substr(0, 3);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(3, 4);\r\n");
      out.write("				          tmp += '-';\r\n");
      out.write("				          tmp += str.substr(7);\r\n");
      out.write("				          return tmp;\r\n");
      out.write("				      }\r\n");
      out.write("				  \r\n");
      out.write("				      return str;\r\n");
      out.write("				}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("				let usertel = document.getElementById('usertel');\r\n");
      out.write("	\r\n");
      out.write("				usertel.onkeyup = function(){\r\n");
      out.write("				  console.log(this.value);\r\n");
      out.write("				  this.value = autoTel( this.value ) ;  \r\n");
      out.write("				}\r\n");
      out.write("			</script>\r\n");
      out.write("			\r\n");
      out.write("				<div class=\"mb-3 agree form-label fw-bold fs-4\" style=\"margin-bottom:50px!important\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"useragree\" name=\"useragree\" value=\"1\"> <label for=\"useragree\">\r\n");
      out.write("                        <span>개인정보 활용 동의</span></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		  	<div class=\"d-grid gap-2 col-6 mx-auto\">\r\n");
      out.write("		  	\r\n");
      out.write("			  <button class=\"btn btn-primary\" type=\"submit\">회원가입</button>\r\n");
      out.write("			  <button class=\"btn btn-outline-primary\" type=\"button\" onclick=\"location.href='./main.jsp'\"\">취소</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("		");

		String warn = request.getParameter("warn");
		String none = request.getParameter("none");
		//warn 변수에 값이 있으면, 리셋
		if(warn != null) {

      out.write("\r\n");
      out.write("			<div class=\"alert alert-danger d-flex align-items-center\" role=\"alert\" style=\"max-width: 600px; margin-top: 30px;\">\r\n");
      out.write("				<svg class=\"bi flex-shrink-0 me-2\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Danger:\"><use xlink:href=\"#exclamation-triangle-fill\"/></svg>\r\n");
      out.write("				<div> 이미 존재하는 아이디입니다. </div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

		}
		if(none != null){

      out.write("			<div class=\"alert alert-danger d-flex align-items-center\" role=\"alert\" style=\"max-width: 600px; margin-top: 30px;\">\r\n");
      out.write("				<svg class=\"bi flex-shrink-0 me-2\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Danger:\"><use xlink:href=\"#exclamation-triangle-fill\"/></svg>\r\n");
      out.write("				<div> 아이디와 비밀번호를 설정해주세요. </div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

		}
	
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</div></div>\r\n");
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
