package sql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class sql1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//		Class.forName("com.mysql.cj.jdbc.Driver");	
//		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","");
//		System.out.println("Connection done");
//		Statement st =conn.createStatement();
//
//		 
//		 ResultSet rs = st.executeQuery("show databases");
//		System.out.println("databases are:"+rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		

		
		
		
		
		
		
// 2nd Method -->>>>

// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
// Class.forName("com.mysql.cj.jdbc.Driver");
// String url = "jdbc:mysql://localhost:3306";
// String user ="root";
// String pass="";
// Connection conn=DriverManager.getConnection(url,user,pass);
// System.out.println("Connected"+conn);
// Statement st =conn.createStatement();
// ResultSet rs = st.executeQuery("show databases");
// System.out.println("databases are:"+rs);
// while(rs.next()) {
// 	System.out.println(rs.getString(1));
// }
		
		
		
		
		
		
		
		
		
		
//		3rd Create  DataBase---->>>>
		


		
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306";
//		String user="root";
//		String pass="";
//		Connection conn =DriverManager.getConnection(url,user,pass);
//
//		System.out.println("Connected:"+conn);
//		Statement st = conn.createStatement();
//		ResultSet rs =st.executeQuery("show databases");
//		System.out.println("database Done");
//		
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		
		
	
		
		
		
		
////		Create Table----->>>>

		
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
		
		
//		String sql ="Create table adit(name varchar(30), address varchar(100) ,age int)";
//			
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("Table Created");

		
		
		
		
//		-->>> insert Data-->>>
		
//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
//		
		
		
//		Statement st = conn.createStatement();
//
//		
//		String query ="insert into adit values('Seema','jind',24)";
//		
//		
//		st.executeUpdate(query);
//		System.out.print("Data Inserted");
		
		
		
		
		
//		Read the Data--->>>
		
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
		
		Statement st = conn.createStatement();

		
		String query ="select * from adit";
		
		ResultSet rs =st.executeQuery(query);
		
		while(rs.next()) {
			String name = rs.getString("name");
			String address = rs.getString("address");
			int age = rs.getInt("age");
			System.out.println("name :"+name +"address: "+address +"age: "+ age);
			
		}
		
		
		
		
		

		
		
		

	}

}
