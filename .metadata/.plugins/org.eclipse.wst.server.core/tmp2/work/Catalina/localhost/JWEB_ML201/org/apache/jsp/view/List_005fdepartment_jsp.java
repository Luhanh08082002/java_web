/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-01-08 06:08:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class List_005fdepartment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Documents/Goc_Hoc_Tap/JAVAWEB/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/JWEB_ML201/WEB-INF/lib/jstl-1.2_1.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2_1.jar", Long.valueOf(1669661659049L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".containerfulls {\r\n");
      out.write("	max-width: 100vw;\r\n");
      out.write("	display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_container {\r\n");
      out.write("	width: 20vw;\r\n");
      out.write("	background-color: #663399;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right_container {\r\n");
      out.write("	width: 80vw;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo_t {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	border-bottom: 1px solid white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	line-height: 50px;\r\n");
      out.write("	color: azure;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_item {\r\n");
      out.write("	padding: 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_item li {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	padding: 13px 20px;\r\n");
      out.write("	border-radius: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_item li:hover {\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_item li span {\r\n");
      out.write("	border: 1px solid white;\r\n");
      out.write("	width: 30px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sibar_item li a {\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: azure;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* right */\r\n");
      out.write(".top_menu_item {\r\n");
      out.write("	box-shadow: rgba(0, 0, 0, 0.02) 0px 1px 3px 0px, rgba(27, 31, 35, 0.15)\r\n");
      out.write("		0px 0px 0px 1px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	background-color: aliceblue;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	color: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*  */\r\n");
      out.write(".menu_itemRight {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	padding-right: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_itemRight li {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	border: 2px solid blue;\r\n");
      out.write("	border-radius: 7px;\r\n");
      out.write("	padding: 4px 12px;\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_itemRight li a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right_container_bt {\r\n");
      out.write("	height: calc(100vh - 50px);\r\n");
      out.write("	background-color: #d7d7d7;\r\n");
      out.write("	padding: 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title_dm {\r\n");
      out.write("	color: gray;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("	padding: 10px 10px;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	box-shadow: rgba(0, 0, 0, 0.02) 0px 1px 3px 0px, rgba(27, 31, 35, 0.15)\r\n");
      out.write("		0px 0px 0px 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item_data {\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item_data h6 {\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item_data_text {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	margin-right: 30px;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=date] {\r\n");
      out.write("	width: 15vw;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	margin-right: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".address_text {\r\n");
      out.write("	width: 74vw;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select {\r\n");
      out.write("	width: 14vw;\r\n");
      out.write("	margin-right: 30px;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".level {\r\n");
      out.write("	width: 22vw;\r\n");
      out.write("	margin-right: 60px;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".achievements_text {\r\n");
      out.write("	width: 74vw;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit_button {\r\n");
      out.write("	margin-top: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit_button button {\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("	padding: 6px 15px;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".create {\r\n");
      out.write("	border: 1px solid blue;\r\n");
      out.write("	color: blue;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancel {\r\n");
      out.write("	border: 1px solid red;\r\n");
      out.write("	color: red;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* LIST DS PHÒNG BAN */\r\n");
      out.write(".container_data {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	margin-right: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".data {\r\n");
      out.write("	padding: 20px 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".data h4 {\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".create_pb {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	border: 1px solid blue;\r\n");
      out.write("	color: blue;\r\n");
      out.write("	border-radius: 7px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background-color: transparent;\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	border-spacing: 0;\r\n");
      out.write("	font-family: 'Droid Serif', serif;\r\n");
      out.write("	overflow: value;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table th, .table td {\r\n");
      out.write("	font-size: 10px;\r\n");
      out.write("	padding: 15px 0;\r\n");
      out.write("	line-height: 20px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	vertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-zebra tbody>tr:nth-child(odd)>td, .table-zebra tbody>tr:nth-child(odd)>th\r\n");
      out.write("	{\r\n");
      out.write("	background-color: #f4f4f4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table td a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	padding: 5px 10px;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container_list {\r\n");
      out.write("	height: 65vh;\r\n");
      out.write("	overflow: auto;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".create_empl {\r\n");
      out.write("	border: 2px solid blueviolet;\r\n");
      out.write("	color: #663399;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".view {\r\n");
      out.write("	border: 2px solid yellowgreen;\r\n");
      out.write("	color: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".update {\r\n");
      out.write("	border: 2px solid blue;\r\n");
      out.write("	color: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete {\r\n");
      out.write("	border: 2px solid red;\r\n");
      out.write("	color: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"containerfulls\">\r\n");
      out.write("		<div class=\"sibar_container\">\r\n");
      out.write("			<div class=\"logo_t\">WEB HRM</div>\r\n");
      out.write("			<div class=\"sibar_item\">\r\n");
      out.write("				<li><span class=\"fa fa-home\"></span> <a href=\"/JWEB_ML201/home\">HOME</a></li>\r\n");
      out.write("				<li><span class=\"fa fa-user\"></span> <a href=\"\">USER\r\n");
      out.write("						PROFILE</a></li>\r\n");
      out.write("				<li><span class=\"fa fa-briefcase\"></span> <a href=\"/JWEB_ML201/ListDepartmentSevlet\">PHÒNG\r\n");
      out.write("						BAN</a></li>\r\n");
      out.write("				<li><span class=\"fa fa-address-card\"></span> <a href=\"/JWEB_ML201/ListEmployeeServlet\">NHÂN\r\n");
      out.write("						VIÊN</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"right_container\">\r\n");
      out.write("			<div class=\"top_menu_item\">\r\n");
      out.write("				<div class=\"title\">\r\n");
      out.write("					<span class=\"fa fa-tongle\"></span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"menu_itemRight\">\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"right_container_bt\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"container_data\">\r\n");
      out.write("					<div class=\"data\">\r\n");
      out.write("						<h4>DANH SÁCH CÁC PHÒNG BAN</h4>\r\n");
      out.write("						<a href=\"/JWEB_ML201/AddDepartmentServlet\" class=\"create_pb\">Tạo\r\n");
      out.write("							Phòng Ban Mới</a>\r\n");
      out.write("						<div class=\"container_list\">\r\n");
      out.write("						<table class=\"table table-zebra table-hover \">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>MÃ PHÒNG BAN</th>\r\n");
      out.write("									<th>TÊN PHÒNG BAN</th>\r\n");
      out.write("									<th>MÔ TẢ</th>\r\n");
      out.write("									<th>TÙY CHỌN</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("\r\n");
      out.write("							<tbody class=\"\">\r\n");
      out.write("\r\n");
      out.write("								");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showMess(id) {\r\n");
      out.write("	var option = cofirm(\"are you sure to delete\");\r\n");
      out.write("	if(option === true){\r\n");
      out.write("		window.location.herf = 'delete?sid='+id;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /view/List_department.jsp(312,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("						<li><a href=\"/JWEB_ML201/LogoutServlet\">Logout</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /view/List_department.jsp(316,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li><a >Khách Hàng</a></li>\r\n");
          out.write("						<li><a href=\"/JWEB_ML201/login\">Login</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /view/List_department.jsp(344,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/view/List_department.jsp(344,8) '${listDep }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listDep }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /view/List_department.jsp(344,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("e");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("									<tr>\r\n");
            out.write("										<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.department_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("										<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.department_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("										<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.mota }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("										<td><a href=\"AddEmployeeServlet\" class=\"create_empl\">Thêm NV</a> <a href=\"\"\r\n");
            out.write("											class=\"view\">Xem NV</a> <a href=\"updateDepartment?sid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.department_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"update \">Sửa</a> <a\r\n");
            out.write("											href=\"delete?sid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.department_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"delete\">xóa</a></td>\r\n");
            out.write("									</tr>\r\n");
            out.write("								");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}