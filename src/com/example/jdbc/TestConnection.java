package com.example.jdbc;
import java.sql.Connection;

import java.sql.*;
public class TestConnection {

	public static void main(String[] args) {
		 String url="jdbc:mysql://localhost:3306/dbasestd";
		 String username="root";
		 String password="janani520#_";
		 
		 try {
			 Connection con=DriverManager.getConnection(url,username,password);
			 System.out.println("connection");
//			 Statement Interface
			 
//			 Statement st=con.createStatement();
//			 String query="Select name,age FROM student_entry";
//			 ResultSet rs=st.executeQuery(query);
//			 
//			 while(rs.next()) {
//				 System.out.println(rs.getString(1)+" "+rs.getInt(2));
//			 }
			 
//			 Prepared Interface
			
//			 String query="Select name,age FROM student_entry where id=5";
//			 String query="Select name,age FROM student_entry" +" where id=?";
			 
//			 PreparedStatement pst=con.prepareStatement(query);
//			 pst.setInt(1,5);
//		     ResultSet rs=pst.executeQuery();
			 
//			 while(rs.next()) {
	//			 System.out.println(rs.getString(1)+" "+rs.getInt(2));
		//	 }
			 
			 
			 
			 
		//	 String query="INSERT INTO COURSE VALUES(?,?,?)";
		//	 PreparedStatement pst=con.prepareStatement(query);
		//	 pst.setInt(1, 121);			
		//	 pst.setString(2,"SQL");
		//	 pst.setNString(3, "gowsi");
		//	 int rows=pst.executeUpdate();
		//	 System.out.println(rows);
			 
			 
		//	 String updatequery="UPDATE COURSE SET TRAINER=? WHERE COURSEID=?";
		//	 PreparedStatement pst=con.prepareStatement(updatequery);
		//	 pst.setNString(1, "RAM");
		//	 pst.setInt(2,121);
		//	 int rows=pst.executeUpdate();
		//	 System.out.println(rows);
			 
			 
			 
			 String updatequery="DELETE  FROM COURSE  WHERE COURSEID=?";
			 PreparedStatement pst=con.prepareStatement(updatequery);
			 pst.setInt(1,121);
			 int rows=pst.executeUpdate();
			 System.out.println(rows);
			 
			 
//			 rs.close();
			 con.close(); 
		 }
		 catch(SQLException e){
			 System.out.println("connection failed: "+ e.getMessage());
		 }
		
		 
		 
		 
		 

	}

}