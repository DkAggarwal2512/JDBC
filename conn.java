package dk;
import  java.sql.*;

public class conn {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
	System.out.println("Connection Done");	
	}}

