package com.training.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;

import com.training.test.model.Product;
import com.training.test.model.User;



public class LoginDaoImpl implements LoginDao{

	@Override
	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();
		Connection con = null;
		
		 try {
	        	
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 String url = "jdbc:mysql://localhost:3306/infinite";
				 
			        String user="root";
			        String password = "india@123";
			        
			    con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from user");
				
				
				while(rs.next()) {
					userList.add(new User(rs.getString(1), rs.getString(2)));
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		 
		 finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 return userList;
			}
	
	

	@Override
	public List<Product> getProd() {
		List<Product> prodList = new ArrayList<>();
		Connection con = null;
		
		 try {
	        	
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 String url = "jdbc:mysql://localhost:3306/infinite";
				 
			        String user="root";
			        String password = "india@123";
			        
			    con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from product");
				
				
				while(rs.next()) {
					prodList.add(new Product(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4)));
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		 
		 finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 return prodList;
	}



//	@Override
//	public List<Product> setProd() {
//		
//		List<Product> prodList = new ArrayList<>();
//		Connection con = null;
//		
//		 try {
//	        	
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				
//				 String url = "jdbc:mysql://localhost:3306/infinite";
//				 
//			        String user="root";
//			        String password = "india@123";
//			        
//			    con = DriverManager.getConnection(url, user, password);
//				Statement stmt = con.createStatement();
//				
//				//ResultSet rs = stmt.executeQuery("insert into product values(?, ?)");
//
//	             PreparedStatement st = con
//	                   .prepareStatement("insert into product values(?, ?)");
//				
////				while(rs.next()) {
////					prodList.add(new Product(rs.setInt(1), rs.setString(2),rs.setString(3),rs.setDouble(4)));
////				}
//	             while(((ResultSet) st).next()) {
//	            	 prodList.add(new Product(st.setInt(1,  request.getParameter("id")),
//			            st.setString(2, request.getParameter("string")),
//			            st.setString(3, request.getParameter("string")),
//			            st.setString(4, request.getParameter("string"))));
//			            
//			            st.executeUpdate();
//	            	 
//	             }
//	             
//	             	
//	             
//				
//			} catch (Exception e) {
//				
//				e.printStackTrace();
//			} 
//		 
//		 finally {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		 return prodList;
//	}
}