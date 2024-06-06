package jdbc;
import java.sql.*;

public class dkk {		 		 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
				Class.forName("com.mysql.cj.jdbc.Driver");
				DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				System.out.println("Connected Successfully.");		
	}

}
