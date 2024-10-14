package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<section class=\"sub-header\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("             <nav>\n");
      out.write("                \n");
      out.write("              <ul>\n");
      out.write("                <li ><a href=\"AdminHomePage.jsp\">Home<br></a></li>\n");
      out.write("                <li><a href=\"AddProduct.jsp\">Add Product</a></li>\n");
      out.write("                <li><a href=\"Search Order To Admin.jsp\">CheckOrder</a></li>                \n");
      out.write("                <li><a href=\"SearchCancelOrderToAdmin.jsp\">CheckCancelOrder </a></li>\n");
      out.write("                <li><a href=\"Datebetween Order Report.jsp\">DatebetweenOrder</a></li>                \n");
      out.write("                <li><a href=\"Datebetween Cancel Order.jsp\">DatebetweenOrderCancel </a></li>\n");
      out.write("                <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>          </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("            <div class=\"title6\">\n");
      out.write("                <h1>Add Product Info</h1>\n");
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
      out.write("    <div class=\"registration\" align=\"center\">Product Info </div>\n");
      out.write("     ");

                String cate=null;
                String name=null;
                
                String color=null;
                String price=null;
                String qty=null;
             
               
                name=request.getParameter("txpname");
                cate=request.getParameter("drpcat");
                 color=request.getParameter("txtcolor");
                 price=request.getParameter("txtprice");
                 qty=request.getParameter("txtqty");
             
                
      out.write("\n");
      out.write("    \n");
      out.write("    <form align=\"center\">\n");
      out.write("        <div class=\"user-details\" >\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            ");

               int i1=0;
               Statement st=con.createStatement();
               String str="select count(*) from addproduct";
               ResultSet rs=st.executeQuery(str);
               while (rs.next())
               {
                 i1=rs.getInt(1);
                 i1++;
               }
                
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Product Id:</span>\n");
      out.write("                <input type=\"text\" name=\"txsrno\" value=\"");
      out.print(i1);
      out.write("\" readonly=\"true\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Categroies</span>\n");
      out.write("                <select name=\"drpcat\" style=\"width: 300px ;height: 40px;border-radius: 5px; border-color: #9b59b6; font-size: medium\" >\n");
      out.write("                    <option>Electronics</option>\n");
      out.write("                    <option>Furniture</option>\n");
      out.write("                    <option>Clothing</option>\n");
      out.write("                    <option>Footwear</option>\n");
      out.write("                    <option>Auto & Parts</option>\n");
      out.write("                     <option>HouseHold Item</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">  Product Name  :</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Product Enter  name\" name=\"txpname\" >\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Color :</span>\n");
      out.write("                <input type=\"text\" placeholder=\"color  name\" name=\"txtcolor\" value=\"\" step=\"1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Price :</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter  Price\" name=\"txtprice\" value=\"\" step=\"1\">\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("             ");

            
           String img1=request.getParameter("upload");
            File f1=new File("img/"+img1);
           
            
          
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Product Image </span>       \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("                <input type=\"file\" name=\"upload\" value=\"\" />\n");
      out.write("               <!-- <input type=\"submit\" value=\"Browse\" name=\"Browse\" />-->\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"input-box\" align=\"center\">\n");
      out.write("                <span class=\"details\">Qty :</span>\n");
      out.write("                <input type=\"text\"  placeholder=\"Enter  qty\" name=\"txtqty\" value=\"\" step=\"1\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                 \n");
      out.write("        <div class=\"button4\" align=\"center\">\n");
      out.write("                \n");
      out.write("          \n");
      out.write("                <input type=\"submit\" value=\"Add Product\" name=\"Add Product\">\n");
      out.write("               <!-- <br><br>\n");
      out.write("                 \n");
      out.write("                <input type=\"submit\" value=\"New\" name=\"Next\">-->\n");
      out.write("                \n");
      out.write("               \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

       Statement st1=con.createStatement();
        if ( name!=null && name!="" && cate!=null && cate!="" && color!=null && color!="" && price!=null && price!=""&& qty!=null && qty!="" && img1!=null && img1!="" )
            {
               String str1="insert into addproduct(id,categories,productnm,color,price,image,qty)values("+i1+",'"+cate+"','"+name+"','"+color+"','"+price+"','"+img1+"',"+qty+")";
               int i=st1.executeUpdate(str1);
               
               out.println("<script>alert('Product Added Success.....')</script>");
             
                
            }
                /*out.println(vdt);
                out.println(vudt);
                out.println(faci);
               out.println(img1);*/
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("                  </div>\n");
      out.write("       </div>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("           \n");
      out.write("  <div class=\"footer\" style=\"color: black;\">\n");
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
