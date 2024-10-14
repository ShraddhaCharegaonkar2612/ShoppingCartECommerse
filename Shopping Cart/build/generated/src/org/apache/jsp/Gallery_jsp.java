package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<section class=\"sub-header\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("             <nav>\n");
      out.write("              <ul>\n");
      out.write("                <li ><a href=\"userhomepage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"SearchProduct.jsp\">SearchProduct</a></li>\n");
      out.write("                <li><a href=\"ChqueOrder To Customer.jsp\">CancelOrder</a></li>                \n");
      out.write("                <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("                            </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("            <div class=\"title6\">\n");
      out.write("                <h1>Search Product</h1>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("</section><br><br><br>\n");
      out.write("    <div class=\"Register\">\n");
      out.write("    <div class=\"container1\">\n");
      out.write("          ");

         
          
           String unm1=(String)session.getAttribute("unm");
       
      out.write(" \n");
      out.write("          <marquee> UserName=");
      out.print(unm1);
      out.write("</marquee>\n");
      out.write("    <div class=\"registration\" align=\"center\">Search Product  </div>\n");
      out.write("    \n");
      out.write("    <form method=\"post\" name=\"form\">\n");
      out.write("       \n");
      out.write("        <div class=\"user-details\" >\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <table border=\"2\" width=\"800px\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("           \n");
      out.write("            \n");
      out.write("   \n");
      out.write("        \n");
      out.write("           \n");
      out.write("              <tr>\n");
      out.write("                          \n");
      out.write("                           <td>Image</td>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                      </tr>\n");

            
String img=null;

    Statement st=con.createStatement();
  
        String str="select * from addproduct";
        
        ResultSet rs=st.executeQuery(str);
        while(rs.next())
        {
            
            img="img/"+ rs.getString(6);
           
            
 
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("\n");
      out.write("         \n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("                        \n");
      out.write("                          <td><img src=\"");
      out.print(img);
      out.write("\" width=\"75\" height=\"75\"></td> \n");
      out.write("            </tr>\n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("                           ");
 
        }
   
  
                           
      out.write(" \n");
      out.write("            </table>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("                \n");
      out.write("             <div class=\"button4\" align=\"center\">\n");
      out.write("               <input type=\"submit\" value=\"Search Product\" name=\"Search Product\">\n");
      out.write("              \n");
      out.write("           </div>\n");
      out.write("        </form>\n");
      out.write("       </div>\n");
      out.write("    </div> \n");
      out.write("        \n");
      out.write("           \n");
      out.write("   <div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\">Designed By:Raut Siddhi & Charegavkar Shraddha SGMCK 2023-24</marquee>\n");
      out.write("</div>\n");
      out.write(" \n");
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
