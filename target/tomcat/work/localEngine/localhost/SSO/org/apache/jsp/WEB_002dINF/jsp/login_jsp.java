package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("\n");
      out.write("<title>SSO登录接口</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"/../css/style.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\" />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\"\n");
      out.write("\tcontent=\"Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<!--Google Fonts-->\n");
      out.write("<link\n");
      out.write("\thref='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link\n");
      out.write("\thref='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<!--Google Fonts-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<h2>SSO单点登录</h2>\n");
      out.write("\t\t<div class=\"login-top\">\n");
      out.write("\t\t\t<h1>请输入账号密码</h1>\n");
      out.write("\t\t\t<form action=\"user/login\" method=\"post\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"appid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"requestUrl\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"> <input\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"userName\"> <input type=\"text\"\n");
      out.write("\t\t\t\t\tname=\"userPassword\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"forgot\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">忘记密码</a> <input type=\"submit\" value=\"登录\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"login-bottom\">\n");
      out.write("\t\t\t<h3>\n");
      out.write("\t\t\t\t新用户 &nbsp;<a href=\"#\">注册</a>&nbsp\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"copyright\">\n");
      out.write("\t\t<p>Copyright &copy; 2016. All rights reserved</p>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
