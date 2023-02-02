package domain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TestInsert {
	public static void main (String[] args) {
		String urlMySql = "jdbc:mysql://localhost:3306/hr";
		String username = "root";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		
		try {
			Connection con  = DriverManager.getConnection(urlMySql,username,password);
			System.out.println("connection sucessfull");
			int i =0;
			int opt = 1;
			while(i< 5 && opt == 1) {
				
				System.out.println(" enter the details of student ");
				System.out.println(" enter the name of student ");
				String name = sc.next();
				System.out.println(" enter the age of student ");
				int  age =sc.nextInt();
				System.out.println(" enter the address of student ");
				String address = sc.next();
				System.out.println(" enter the course id of student ");
			    int course = sc.nextInt();				
				
				String query = "insert into student(name ,age,address,course) values('"+name + "'," +age+",'"+address+"','"+course+"'"+")";
				
				Statement stmt = con.createStatement();
				 stmt.executeUpdate(query);
				
			    System.out.println("record inserted sucessfully");
			    
			    System.out.println("press 1 to continue 0 to exit");
			    opt = sc.nextInt();
			    i++;
			    
			    
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
