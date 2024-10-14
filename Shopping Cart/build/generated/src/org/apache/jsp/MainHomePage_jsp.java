package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("   <body>\n");
      out.write("       \n");
      out.write("  <header>\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li ><a href=\"MainHomePage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"AdminLogin.jsp\">Admin Login</a></li>\n");
      out.write("                <li><a href=\"UserLogin.jsp\">Customer Login</a></li>                \n");
      out.write("                <li><a href=\"contactus.jsp\">Contact Us</a></li>\n");
      out.write("                 <li><a href=\"feedback.jsp\">FeedBack</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"title\">\n");
      out.write("             <h3 align=\"center\">Save time and  money with our online store!</h3>\n");
      out.write("            <h1 align=\"center\">A fresh approach to shopping.</h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("</header>\n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <!--about us-->\n");
      out.write("    <br><br><br><div class=\"title4\"><h1 align=\"center\">Why to Visit Our Website...</h1></div>\n");
      out.write("    <div class=\"about\">\n");
      out.write("        \n");
      out.write("    <div class=\"about-section\">\n");
      out.write("        <div class=\"inner-container\">\n");
      out.write("            <h1>Benefit of our Website</h1>\n");
      out.write("            <p class=\"text\">What is an e-commerce online shopping cart? An online shopping cart is software that makes it possible for customers to select products and buy them online. In a brick-and-mortar setting, a customer could browse, grab a product off the shelf, and head to the checkout counter to make a purchase.</p>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("<!--</about-->\n");
      out.write("\n");
      out.write("<div class=\"Gallery\">\n");
      out.write("        <div class=\"title2\">\n");
      out.write("            <br>\n");
      out.write("            <h1 align=\"center\">Our Shopping Products</h1><br><br>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    <div class=\"box\"><img src=\"img/a2.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("          \n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/a4.jpg\">  <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\" >\n");
      out.write("                           \n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/a5.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                            \n");
      out.write("    </a></div>\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"box\"><img src=\"img/a6.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                             \n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/a7.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                           \n");
      out.write("    </a></div>\n");
      out.write("    \n");
      out.write("    <div class=\"box\"><img src=\"img/a8.jpg\"> <a class=\"destination-overlay text-white text-decoration-none\" href=\"Cust_Login.jsp\">\n");
      out.write("                           \n");
      out.write("    </a></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("<div class=\"Yojana\">\n");
      out.write("  &nbsp;<div class=\"title3\"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("<!--                  <h3 align=\"center\">योजना </h3>-->\n");
      out.write("                   <h1 align=\"center\">Cart Category</h1>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("<div class=\"gallery-sec\">\n");
      out.write("    \n");
      out.write("    <div class=\"gallery-wrap\">\n");
      out.write("        \n");
      out.write("        <div class=\"gallery-img\">\n");
      out.write("              \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s4.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Electronics</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s5.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                     <h1>Furniture </h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s6.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Clothing</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s7.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Footwear</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s8.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1>Auto & Parts</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"photo\">\n");
      out.write("                <div class=\"img-sec\">\n");
      out.write("                    <img src=\"img/s9.jpg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h1> HouseHold Item</h1>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<!--footer start-->\n");
      out.write("<div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\">Designed By: Siddhi Raut and Shraddha Charegaonkar from SGMCK 2023-24</marquee>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
