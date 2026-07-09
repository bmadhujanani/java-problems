package com.example.jdbc;
import java.sql.*;
import java.util.*;

public class Ccvehicle {
	public static void main(String[] args) {
		 String url="jdbc:mysql://localhost:3306/vehicledb";
		 String username="root";
		 String password="janani520#_";
		 
		 
		 try {
			 Connection con=DriverManager.getConnection(url,username,password);
			 System.out.println("connection");
			 
			 System.out.println("1.CREATE (INSERT) VEHICLE \n2.GET VEHICLES \n3.GET VEHICLE BY ID \n4.GET VEHICLE BY MAKE \n5.UPDATE VEHICLE \n6.DELETE VEHICLE \n0.EXIT");
			 System.out.println("ENTER YOUR CHOICE 1/2/3/4/5/6/0:");

			 Scanner sc=new Scanner(System.in);
			 int choice=sc.nextInt();
			 while(choice!=0) {
			  switch(choice) {
			     case 1:
			    	 String insertquery="INSERT INTO vehicle VALUES(?,?,?,?)";
			 		 PreparedStatement pst=con.prepareStatement(insertquery);
			 		 System.out.println("ID:");
			 		 pst.setInt(1,sc.nextInt());
			 		 System.out.println("YEAR:");
			 		 pst.setInt(2,sc.nextInt());
			 		 sc.nextLine();
			 		 System.out.println("MODEL:");
			 		 pst.setString(3,sc.nextLine());
			 		 System.out.println("MAKE:");
			 		 pst.setString(4,sc.nextLine());

			 		 int rows=pst.executeUpdate();
	
			         break;
			         
			         

			     case 2:
			    	    String selectQuery = "SELECT * FROM vehicle";
			    	    PreparedStatement pst1 = con.prepareStatement(selectQuery);

			    	    ResultSet rs = pst1.executeQuery();

			    	    System.out.println("ID\tYEAR\tMODEL\tMAKE");
			    	    System.out.println("--------------------------------");

			    	    while (rs.next()) {
			    	        System.out.println(
			    	            rs.getInt("ID") + "\t" +
			    	            rs.getInt("YEAR") + "\t" +
			    	            rs.getString("MODEL") + "\t" +
			    	            rs.getString("MAKE")
			    	        );
			    	    }
			    	    break;

			     case 3:
			    	 String searchQuery = "SELECT * FROM vehicle WHERE ID=?";
			    	    PreparedStatement pst2 = con.prepareStatement(searchQuery);
			    	    System.out.println("ENTER VEHICLE ID: ");
			    	    pst2.setInt(1,sc.nextInt());
			    	    ResultSet rs1 = pst2.executeQuery();
			    	    if(rs1.next()) {
			    	    	System.out.println("ID\tYEAR\tMODEL\tMAKE");
			    	    	System.out.println(
				    	            rs1.getInt("ID") + "\t" +
				    	            rs1.getInt("YEAR") + "\t" +
				    	            rs1.getString("MODEL") + "\t" +
				    	            rs1.getString("MAKE")
				    	        );
			    	    	
			    	    }
			    	    else {
			    	    	System.out.println("VEHICLE NOT FOUND.");
			    	    }
			         break;

			     case 4:
			    	 String searchQuery2 = "SELECT * FROM vehicle WHERE MAKE=?";
			    	    PreparedStatement pst3 = con.prepareStatement(searchQuery2);
			    	    System.out.println("ENTER VEHICLE MAKE: ");
			    	    pst3.setInt(1,sc.nextInt());
			    	    ResultSet rs2 = pst3.executeQuery();
			    	    if(rs2.next()) {
			    	    	System.out.println("ID\tYEAR\tMODEL\tMAKE");
			    	    	System.out.println(
				    	            rs2.getInt("ID") + "\t" +
				    	            rs2.getInt("YEAR") + "\t" +
				    	            rs2.getString("MODEL") + "\t" +
				    	            rs2.getString("MAKE")
				    	        );
			    	    	
			    	    }
			    	    else {
			    	    	System.out.println("VEHICLE NOT FOUND.");
			    	    }
			         break;

			     case 5:
			    	 String updatequery="UPDATE vehicle INTO set YEAR=? WHERE ID=?";
			 		 PreparedStatement pst4=con.prepareStatement(updatequery);
			 		 System.out.println("YEAR UPDATE:");
			 		 pst4.setInt(1,sc.nextInt());
			 		 System.out.println("ID:");
			 		 pst4.setInt(2,sc.nextInt());
			 		 

			 		 int rows2=pst4.executeUpdate();
	
			         break;
			       
			     case 6:
			    	 return;

			     default:
			         System.out.println("Invalid choice!");
			 }
			 System.out.println("enter your choice");
			 choice=sc.nextInt();
			}
			 
			 
			 
			 
		 }
		 catch(SQLException e){
			 System.out.println("connection failed: "+ e.getMessage());
		 }
		 
	}

}
