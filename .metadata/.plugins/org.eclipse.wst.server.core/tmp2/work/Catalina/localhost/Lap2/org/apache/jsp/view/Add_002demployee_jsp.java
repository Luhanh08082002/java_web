/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-01-03 06:29:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vku.udn.vn.common.EmployeeDao;
import vku.udn.vn.model.Department;
import java.util.ArrayList;
import vku.udn.vn.common.EmployeeDao;
import vku.udn.vn.model.Department;

public final class Add_002demployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vku.udn.vn.common.EmployeeDao");
    _jspx_imports_classes.add("vku.udn.vn.model.Department");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("       <style>\r\n");
      out.write("            * {\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                font-family: 'Roboto', sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .container {\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                height: 45px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .left-menu a {\r\n");
      out.write("                line-height: 45px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: gray;\r\n");
      out.write("                padding: 0px 30px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .right-menu {\r\n");
      out.write("                display: flex;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .right-menu a {\r\n");
      out.write("                line-height: 45px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: gray;\r\n");
      out.write("                padding: 0px 30px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .addantemployee {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .fromEployee {\r\n");
      out.write("                margin-top: 50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .fromEployee h3 {\r\n");
      out.write("                font-size: 40px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .fromEployee .form {\r\n");
      out.write("                margin: 20px 0;\r\n");
      out.write("            }\r\n");
      out.write("            .form div{\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .form button{\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                padding: 7px 14px;\r\n");
      out.write("                background-color: blue;\r\n");
      out.write("                color: white;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                font-weight: 600;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form input[type=\"text\"] {\r\n");
      out.write("                margin: 5px 0;\r\n");
      out.write("                width: 500px;\r\n");
      out.write("                padding: 5px 10px;\r\n");
      out.write("                border: 1px solid gray;\r\n");
      out.write("\r\n");
      out.write("                border-radius: 7px;\r\n");
      out.write("            }\r\n");
      out.write("            #department{\r\n");
      out.write("                margin: 5px 0;\r\n");
      out.write("                width: 500px;\r\n");
      out.write("                padding: 5px 10px;\r\n");
      out.write("                border: 1px solid gray;\r\n");
      out.write("\r\n");
      out.write("                border-radius: 7px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"left-menu\">\r\n");
      out.write("			<a href=\"\" class=\"active\">home pages</a> <a href=\"\">Add an\r\n");
      out.write("				employee</a> <a href=\"\">List employees</a>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"right-menu\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<!-- <img src=\"\" alt=\"\" width=\"50px\" height=\"50px\"> -->\r\n");
      out.write("				<a href=\"\">Khách Hàng</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<!-- <img src=\"\" alt=\"\" width=\"50px\" height=\"50px\"> -->\r\n");
      out.write("				<a href=\"\">Logout</a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	 <div class=\"addantemployee\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"fromEployee\">\r\n");
      out.write("                <h3>List Employees </h3>\r\n");
      out.write("                <div class=\"form\">\r\n");
      out.write("                    <form action=\"/Lap2/addemployee\" method=\"post\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label for=\"\">Name :</label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"Enter Name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label for=\"\">Gender  :\r\n");
      out.write("                            <input name=\"gender\" type=\"radio\"> Male \r\n");
      out.write("                            <input type=\"radio\" name=\"gender\" id=\"\"> Femade\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label for=\"\">Date Of Birth :</label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"date_of_birth\" placeholder=\"dd/mm/yyyy\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label for=\"\">Department :</label><br>\r\n");
      out.write("                        ");

                        EmployeeDao dao = new EmployeeDao();
                        ArrayList<Department> list = dao.getAllDepartment();
                        
      out.write("\r\n");
      out.write("                        <select id=\"department\" name=\"department\">\r\n");
      out.write("                           ");
 for(Department o : list){ 
      out.write("\r\n");
      out.write("                            <option value=\"");
out.print(o.getDepartment_name()); 
      out.write("\">\r\n");
      out.write("                            ");
out.print(o.getDepartment_name()); 
      out.write("\r\n");
      out.write("                            </option>\r\n");
      out.write("                            ");
} 
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                        <button type=\"submit\"> Add Employee</button>\r\n");
      out.write("                 \r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
