package com.training.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.test.model.Product;
import com.training.test.model.User;


/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user1 = (String)request.getAttribute("user1");
		
		
		List<Product> pdrList = (List<Product>)request.getAttribute("prodList");
		
		  out.println("<html>");
          out.println("<head>");
          out.println("<style>");  
	           
          out.println("h1 {");       
          out.println("color:blue;");
         
          out.println("}");  
          out.println("* {");       
          out.println("background-color:#f1f1f1;");
         
          out.println("}");  
         
          out.println(".center {"); 
          out.println(" margin-left: auto;\r\n"
          		+ "  margin-right: auto;"); 
          out.println("background-color:red;");
          out.println("}"); 
          
        
          out.println(".Link1 {");       
          out.println(" text-align: center;"
          		+ "display:block;");
        
          out.println("}"); 
          out.println("</style>");  
          
	
		out.print("<h1>Welcome "+user1+"! You are successfully Enter In Product Table</h1> <br>");
		
		
		//out.print("<br><a href='product.html'>Add Product</a><br><br>");
		//out.print("<br><a href='delete.html'>Delete Product</a><br><br>");
		//out.print("<br><a href='update.html'>Update Product</a><br><br>");
		out.println("<div class='Link1'>");
		out.print("<a href='product.html' class='link'><button type=\"button\">ADD PRODUCT</button></a>");
		out.print("<a href='delete.html' class='link'><button type=\"button\">DELETE PRODUCT</button></a>");
		out.print("<a href='update.html'><button type=\"button\">UPDATE PRODUCT</button></a><br><br>");
		out.println("</div>");

	
		    out.println("<br><br><br><table border='5' class='center' > ");
			out.println("<tr> <th>");
			out.println("Product ID </th>");
			out.println("<th> Product Name </th>");
			out.println("<th> Product Desc </th>");
			out.println("<th> Product Price </th>");

			
			for(Product pdr:pdrList) {
				out.println("<tr><td>" +pdr.getProdId() +"</td>");
				out.println("<td>" +pdr.getProductName() +"</td> ");
				out.println("<td>" +pdr.getProductDesc() +"</td> ");
				out.println("<td>" +pdr.getPrice() +"</td> </tr>");
			}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
