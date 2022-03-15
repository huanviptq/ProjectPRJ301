package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("  \t<title>Signup 05</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"background-image: url(https://4kwallpapers.com/images/wallpapers/razer-neon-lights-colorful-dark-background-3840x2400-4453.jpg)\">\n");
      out.write("\t<section class=\"ftco-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-center mb-5\">\n");
      out.write("\t\t\t\t\t<h2 style='color: white' class=\"heading-section\">Login</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-7 col-lg-5\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t<div class=\"img\" style=\"background-image: url(https://preview.redd.it/nu9vyciul7081.jpg?width=640&crop=smart&auto=webp&s=1fa9321628cb05c5d33c6492d931ce5ef4ee2ecf);\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"login-wrap p-4 p-md-5\">\n");
      out.write("\t\t\t      \t<div class=\"d-flex\">\n");
      out.write("\t\t\t      \t\t<div class=\"w-100\">\n");
      out.write("\t\t\t      \t\t\t<h3 class=\"mb-4\">Sign up</h3>\n");
      out.write("\t\t\t      \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t      \t</div>\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"signin-form\">\n");
      out.write("\t\t\t      \t\t<div class=\"form-group mt-3\">\n");
      out.write("\t\t\t      \t\t\t<input type=\"text\" class=\"form-control\" required>\n");
      out.write("\t\t\t      \t\t\t<label class=\"form-control-placeholder\" for=\"username\">Username</label>\n");
      out.write("\t\t\t      \t\t</div>\n");
      out.write("\t\t            <div class=\"form-group\">\n");
      out.write("\t\t              <input id=\"password-field\" type=\"password\" class=\"form-control\" required>\n");
      out.write("\t\t              <label class=\"form-control-placeholder\" for=\"password\">Password</label>\n");
      out.write("\t\t              <span toggle=\"#password-field\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("\t\t            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\t\t              <input id=\"password-field\" type=\"password\" class=\"form-control\" required>\n");
      out.write("\t\t              <label class=\"form-control-placeholder\" for=\"password\">Confirm Password</label>\n");
      out.write("\t\t              <span toggle=\"#password-field\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"form-group\">\n");
      out.write("\t\t            \t<button type=\"submit\" class=\"form-control btn btn-primary rounded submit px-3\">Sign In</button>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"form-group d-md-flex\">\n");
      out.write("\t\t            \t<div class=\"w-50 text-left\">\n");
      out.write("\t\t\t            \t<label class=\"checkbox-wrap checkbox-primary mb-0\">Remember Me\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"checkbox\" checked>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <span class=\"checkmark\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"w-50 text-md-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Forgot Password</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t          </form>\n");
      out.write("\t\t          <p class=\"text-center\">Don't have an account? <a href=\"register.jsp\">Sign Up</a></p>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
