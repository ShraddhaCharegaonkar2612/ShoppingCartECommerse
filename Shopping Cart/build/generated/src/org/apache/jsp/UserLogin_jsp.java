package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class UserLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Connection.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
 
           Class.forName("com.mysql.jdbc.Driver");
           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingcart","root","root");
          
           
           
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <link href=\"new.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <section class=\"sub-header\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <nav>\n");
      out.write("                \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"UserLogin.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("               \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <div class=\"title6\">\n");
      out.write("                <h1>Login</h1>   \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section>&ensp;\n");
      out.write("        <div class=\"login\">\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("            <img src=\"img/loginlogo.jpg\" class=\"avatar\">\n");
      out.write("            <h1>Login Here</h1>\n");
      out.write("            <form>\n");
      out.write("                ");
 
                    String user=null;
                    String pass=null;
                    
                    user=request.getParameter("txname");
                    pass=request.getParameter("txpass");
                    
                
      out.write("\n");
      out.write("                <p>Username</p>\n");
      out.write("                <input type=\"text\"  placeholder=\"Enter Username\" name=\"txname\">\n");
      out.write("                <p>Password</p>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter password\" name=\"txpass\">\n");
      out.write("                <input type=\"Submit\" name=\"Login\" value=\"Login\">\n");
      out.write("                <a href=\"userforgetpass.jsp\">Forget Password??</a><br>\n");
      out.write("                <a href=\"registeration.jsp\">Don't have an account?</a>\n");
      out.write("                ");
 
                     Statement st=con.createStatement();
                    if(user!=null && user!="" && pass!=null && pass!="")
                    {
                        
                       String str="select * from userregistration where username='"+user+"' and password='"+pass+"'";
                       ResultSet rs1=st.executeQuery(str);
                        if(rs1.next())
                        {
                            out.println("<script>alert('User login sucesseful...')</script>");
                           session.setAttribute("unm", user);
                            response.sendRedirect("userhomepage.jsp");
                        }
                        else{
                            out.println("<script>alert('User login failed...')</script>");
                           response.sendRedirect("registeration.jsp");
                        }
                        
                    }
                
      out.write("\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("            <!--footer start-->\n");
      out.write("\n");
      out.write("          <div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\">Designed By:Raut Siddhi & Charegavkar Shraddha SGMCK 2023-24</marquee>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
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
