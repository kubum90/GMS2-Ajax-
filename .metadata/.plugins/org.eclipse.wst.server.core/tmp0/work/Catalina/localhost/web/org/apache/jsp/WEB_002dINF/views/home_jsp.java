/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.45
 * Generated at: 2017-10-17 10:19:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t<title>Document</title>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"home-container\" class=\"homecontent\" style=\"background-image: url(//content.skyscnr.com/6bf5a29ce130132f28e912434f295b76/canada-lake-feb.jpg?crop=200px:45px&amp;quality=40)\">\r\n");
      out.write("    <div class=\"wrap-homecontent\">\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"searchcontrol\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("          <script>\r\n");
      out.write("  (function() {\r\n");
      out.write("    $('#home-container').css(\"background-image\", \"url(//content.skyscnr.com/6bf5a29ce130132f28e912434f295b76/canada-lake-feb.jpg?crop=2000px:599px&quality=80)\");\r\n");
      out.write("  })();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<section id=\"js-search-controls-container\" class=\"search-controls one-line-search-controls opaque-on-desktop\">\r\n");
      out.write("        <form action=\"#\" class=\"clearfix\">\r\n");
      out.write("                <section id=\"js-trip-type\" class=\"search-controls-trip-type multi-city-enabled\">\r\n");
      out.write("                    <div class=\"mobile-container\">\r\n");
      out.write("                        <input type=\"radio\" id=\"js-is-return-input\" name=\"trip-type\" value=\"return\" class=\"visuallyhidden\" tabindex=\"1\" />\r\n");
      out.write("                        <label for=\"js-is-return-input\" class=\"return-trip\">왕복</label>\r\n");
      out.write("                        <input type=\"radio\" id=\"js-one-way-input\" name=\"trip-type\" value=\"oneway\" class=\"visuallyhidden\" tabindex=\"1\" />\r\n");
      out.write("                        <label for=\"js-one-way-input\" class=\"one-way-trip\">편도</label>\r\n");
      out.write("                        <input type=\"radio\" id=\"js-multi-city-input\" name=\"trip-type\" value=\"multicity\" class=\"visuallyhidden\" tabindex=\"1\" />\r\n");
      out.write("                        <label for=\"js-multi-city-input\" class=\"multi-city-trip\">다구간</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            <section class=\"traditional-search clearfix\">\r\n");
      out.write("                <div id=\"js-places\" class=\"search-controls-places clearfix\">\r\n");
      out.write("                    <div class=\"origin-place\">\r\n");
      out.write("                        <label for=\"js-origin-input\" class=\"place-label\">출발지</label>\r\n");
      out.write("                        <input type=\"text\" id=\"js-origin-input\" tabindex=\"2\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\" spellcheck=\"false\" dir=\"auto\">\r\n");
      out.write("                        <label class=\"nearby-alts sc-checkbox\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"js-outbound-alts\" class=\"visuallyhidden\" />\r\n");
      out.write("                            주변 공항 추가\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"button\" id=\"js-places-toggle\" class=\"swap-button\" title=\"여기를 클릭하여 장소 변경\">\r\n");
      out.write("                        <span class=\"visuallyhidden\">여기를 클릭하여 장소 변경</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"destination-place\">\r\n");
      out.write("                        <label for=\"js-destination-input\" class=\"place-label\">도착지</label>\r\n");
      out.write("                        <input type=\"text\" id=\"js-destination-input\" placeholder=\"국가, 도시 또는 공항 이름을 입력해 주십시오.\" tabindex=\"2\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\" spellcheck=\"false\" dir=\"auto\">\r\n");
      out.write("                        <label class=\"nearby-alts sc-checkbox\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"js-inbound-alts\" class=\"visuallyhidden\" />\r\n");
      out.write("                            주변 공항 추가\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><div id=\"js-dates\" class=\"search-controls-dates\">\r\n");
      out.write("                    <div class=\"depart\">\r\n");
      out.write("                        <label for=\"js-depart-input\">가는날</label>\r\n");
      out.write("                        <input type=\"text\" id=\"js-depart-input\" tabindex=\"3\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\" spellcheck=\"false\" readonly=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"return \">\r\n");
      out.write("                        <label for=\"js-return-input\">오는날</label>\r\n");
      out.write("                        <input type=\"text\" id=\"js-return-input\" tabindex=\"3\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\" spellcheck=\"false\" readonly=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span id=\"js-depart-summary\" class=\"date-summary\"></span>\r\n");
      out.write("                    <span id=\"js-return-summary\" class=\"date-summary\"></span>\r\n");
      out.write("                </div><div id=\"js-pax-cabin-class\" class=\"search-controls-pax-cabin-class\">\r\n");
      out.write("                    <label for=\"js-trad-cabin-class-travellers-toggle\">좌석 등급 및 승객</label>\r\n");
      out.write("                    <button type=\"button\" id=\"js-trad-cabin-class-travellers-toggle\" class=\"cabin-class-travellers-trigger\" tabindex=\"1\">\r\n");
      out.write("                        <span class=\"down-arrow\">â–¼</span>\r\n");
      out.write("                        <span class=\"adult-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <label class=\"sc-checkbox prefer-directs\">\r\n");
      out.write("                    <input type=\"checkbox\" id=\"js-prefer-directs\" class=\"visuallyhidden\" tabindex=\"1\"> 직항만\r\n");
      out.write("                </label>\r\n");
      out.write("                <button class=\"js-search-button fss-bpk-button fss-bpk-button--large\" type=\"button\" tabindex=\"1\">\r\n");
      out.write("                    <span class=\"bpk-text\">항공권 검색&nbsp;</span>\r\n");
      out.write("                    <span class=\"bpk-icon-lg bpk-icon-pointer bpk-icon-lg--align-to-button\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </section>\r\n");
      out.write("        </form>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t\r\n");
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
