/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.86
 * Generated at: 2023-06-01 08:13:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.CH11;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import addrBook.addrDo;

public final class addrModify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("addrBook.addrDo");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2> 선택된 주소데이터 수정하기 (addrModify.jsp) </h2>\r\n");
      out.write("	<hr>\r\n");
      out.write("	");
      addrBook.addrDao adao = null;
      adao = (addrBook.addrDao) _jspx_page_context.getAttribute("adao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (adao == null){
        adao = new addrBook.addrDao();
        _jspx_page_context.setAttribute("adao", adao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');

		int num = Integer.parseInt(request.getParameter("num"));
		addrDo ado = adao.getOneAddr(num);
	
	
	
      out.write("\r\n");
      out.write("	<form action=\"addrModifyProc.jsp\">\r\n");
      out.write("		<table border=\"1\" >\r\n");
      out.write("		<tr height=\"60\" align=\"center\">\r\n");
      out.write("			<td width=\"100\"> 이름 </td>\r\n");
      out.write("			<td width=\"500\"> <input type=\"text\" name=\"name\" value=\"");
      out.print( ado.getName() );
      out.write("\"> </td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"60\" align=\"center\">\r\n");
      out.write("			<td width=\"100\"> 전화번호 </td>\r\n");
      out.write("			<td width=\"500\"> <input type=\"text\" name=\"tel\" value=\"");
      out.print( ado.getTel() );
      out.write("\"> </td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"60\" align=\"center\">\r\n");
      out.write("			<td width=\"100\"> 취미 </td>\r\n");
      out.write("			<td width=\"500\"> \r\n");
      out.write("				<input type=\"text\" name=\"hobby\" value=\"");
      out.print( ado.getHobby() );
      out.write("\">\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"60\" align=\"center\">\r\n");
      out.write("			<td width=\"100\"> 직업 </td>\r\n");
      out.write("			<td width=\"500\"> \r\n");
      out.write("				<input type=\"text\" name=\"job\" value=\"");
      out.print( ado.getJob() );
      out.write("\">\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr height=\"60\" align=\"center\">\r\n");
      out.write("			<td colspan=\"2\"> \r\n");
      out.write("				<input type =\"hidden\" name=\"num\" value=\"");
      out.print( ado.getNum());
      out.write("\">\r\n");
      out.write("				<input type=\"submit\" value=\"수정하기\" onclick=\"location.href='addrModify.jsp?num=");
      out.print(ado.getNum() );
      out.write("'\">\r\n");
      out.write("				<input type=\"button\" value=\"삭제하기\" onclick=\"location.href='addrDelete.jsp?num=");
      out.print(ado.getNum() );
      out.write("'\">\r\n");
      out.write("				<input type=\"button\" value=\"목록보기\" onclick=\"location.href='addrList.jsp?num=");
      out.print(ado.getNum() );
      out.write("'\">\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	</form>\r\n");
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
