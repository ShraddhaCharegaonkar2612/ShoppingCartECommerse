package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registeration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\">\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("function validate()\n");
      out.write("{ \n");
      out.write("if( document.mobilenumbervalidation.txmobile.value == \"\" ||\n");
      out.write("isNaN( document.mobilenumbervalidation.txmobile.value) ||\n");
      out.write("document.mobilenumbervalidation.txmobile.value.length != 10 )\n");
      out.write("{\n");
      out.write("alert( \"Please provide a 10 digit no\" );\n");
      out.write("document.mobilenumbervalidation.txmobile.focus() ;\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("var email = document.mobilenumbervalidation.txemail.value;\n");
      out.write("atpos = email.indexOf(\"@\");\n");
      out.write("dotpos = email.lastIndexOf(\".\");\n");
      out.write("if (email == \"\" || atpos < 1 || ( dotpos - atpos < 2 )) \n");
      out.write("{\n");
      out.write("alert(\"Please enter correct email ID\");\n");
      out.write("document.mobilenumbervalidation.txemail.focus() ;\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("return( true );\n");
      out.write("}\n");
      out.write("</script> \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    <section class=\"sub-header\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <nav>\n");
      out.write("                \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"registeration.jsp\">Registeration</a></li>\n");
      out.write("                    <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("               \n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("            </nav>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("            <div class=\"title6\">\n");
      out.write("                <h1>Registration</h1>\n");
      out.write("                <!--<div>\n");
      out.write("                    <button class=\"Login-btn\" type=\"button\"><span class=\"cover\"></span>Login</button>\n");
      out.write("                    <button class=\"Registration-btn\" type=\"button\"><span class=\"cover\"></span>Registration</button>\n");
      out.write("                </div>-->\n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("    </section><br><br><br>\n");
      out.write("    <div class=\"Register\">\n");
      out.write("    <div class=\"container1\">\n");
      out.write("    <div class=\"registration\">Registration</div><br>\n");
      out.write("    ");

        String fnm=null;
      
        String pin=null;
        String email=null;
        String mobile=null;
        String uname=null;
        String pass=null;
      
        String add=null;
        String rid=null;
        
        fnm=request.getParameter("txfname");
       
        pin=request.getParameter("txpcode");
        email=request.getParameter("txemail");
        mobile=request.getParameter("txmobile");
        uname=request.getParameter("txuname");
        pass=request.getParameter("txpassword");
      
        add=request.getParameter("txaddress");
      
        
        
      out.write("\n");
      out.write("   <form method=\"get\" action=\"\" name=\"mobilenumbervalidation\" onsubmit=\"return(validate());\"> \n");
      out.write("        <div class=\"user-details\">\n");
      out.write("            ");

               int i1=0;
               Statement st=con.createStatement();
               String str="select count(*) from userregistration";
               ResultSet rs=st.executeQuery(str);
               while (rs.next())
               {
                 i1=rs.getInt(1);
                 i1++;
               }
                
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Registration ID</span>\n");
      out.write("                <input type=\"text\"  name=\"txrid\" value=\"");
      out.print(i1);
      out.write("\" readonly= \"true\" />\n");
      out.write("            </div>\n");
      out.write("             <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Full Name</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your name\" name=\"txfname\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Mobile Number</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your mobile number\" name=\"txmobile\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Address</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your address\"  name=\"txaddress\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("           \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Pincode</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your pincode\" name=\"txpcode\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Email</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your email\"  name=\"txemail\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">User Name</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your Username\" name=\"txuname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Password</span>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter your Password\"  name=\"txpassword\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       <div class=\"button1\" >\n");
      out.write("           <input type=\"submit\" value=\"Register\">\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        ");

        
            
            Statement st1=con.createStatement();
        if (fnm!=null && fnm!=""  && pin!=null && pin!="" && email!=null && email!="" && mobile!=null && mobile!="" && uname!=null && uname!="" && pass!=null && pass!="" && add!=null && add!="")
            {
                String str1="insert into userregistration(id,fullname,mobileno,address,pincode,emailid,username,password) values("+i1+",'"+fnm+"',"+mobile+",'"+add+"','"+pin+"','"+email+"','"+uname+"','"+pass+"')";
                int i=st.executeUpdate(str1);
                out.println("<script>alert('Your Registration  success......')</script>");
                //response.sendRedirect("Login.jsp");
            }
      
        
      out.write("\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("      <div class=\"footer\" style=\"color: black;\">\n");
      out.write("    <marquee> <p class=\"design\">Designed By:Raut Siddhi & Charegavkar Shriddha SGMCK 2023-24</marquee>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>");
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
