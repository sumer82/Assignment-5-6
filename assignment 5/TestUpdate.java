package domain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TestUpdate {
	public static void main (String[] args) {
		String urlMySql = "jdbc:mysql://localhost:3306/hr";
		String username = "root";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		
		try {
			Connection con  = DriverManager.getConnection(urlMySql,username,password);
			System.out.println("connection sucessfull");
			int opt = 1;
			while(opt == 1) {
				
				System.out.println(" enter the details of column that you want update ");
				System.out.println(" enter the name of column you want update");
				String column = sc.next();
				System.out.println(" enter the new value");
				String value = sc.next();
				System.out.println(" on what basic  you want to update column ");
				String  option =sc.next();
				System.out.println(" enter the value");
				String  optionValue =sc.next();
				
				String query = "update student set "+column + " = '" +value+"'  where "+option+" = "+optionValue+"";
			    Statement stmt = con.createStatement();
				 stmt.executeUpdate(query);
				
			    System.out.println("record updated sucessfully");
			    
			    System.out.println("press 1 to continue 0 to exit");
			    opt = sc.nextInt();
			    
			    
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
