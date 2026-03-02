package Basic_Calls;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDthree {

	public static void main(String[] args)throws SQLException {
		//Dynamic Query =>PreparedStatement =>Precompiled =>Faster
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the id:");
		int id=sc.nextInt();
		
		System.out.println("Please enter the Name:");
		String s=sc.next();
		
		System.out.println("Please enter the Ciy:");
		String c=sc.next();
		
		
	
		try(
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
				)
		
		
		{
			
			PreparedStatement stmt=conn.prepareStatement("insert into student values(?,?,?);");
			//its Static with Dynamic
			stmt.setInt(1,id);
			stmt.setString(2,s);
			stmt.setString(3, c);
		
			int j=stmt.executeUpdate();
			System.out.println("Row affected.."+j);
			
		}
		
	
	
	}
}

	
	


