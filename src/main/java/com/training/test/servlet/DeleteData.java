package com.training.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteData
 */
@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 try {
			 
			 Connection con = DatabaseConnection.initializeDatabase();
	  
	             PreparedStatement st = con
	                   .prepareStatement("delete from product where PROD_ID=?");
	  
	           
	            st.setInt(1, Integer.valueOf(request.getParameter("id")));
	            
	           st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	  
	           
	            PrintWriter out = response.getWriter();
	           
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<style>");  
		           
	            out.println("h1 {");       
	            out.println("color:blue;");
	           
	            out.println("}");  
	            out.println("* {");       
	            out.println("background-color:#f1f1f1;");
	           
	            out.println("}");  
	           
	            out.println("</style>");  
	            
	            out.println("<html><body><b><h1>Successfully Deleted Product</h1>"
	            		
	                        + "</b></body></html>");
	       
	            
	           
	           
	            
 }
	        catch (Exception e) {
	            e.printStackTrace();
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
