package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDfour {

	public static void main(String[] args) {
		// executeQuery ()=> return ResultSet =>SELECT =>data

		try (
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			)
		{
			PreparedStatement stmt=conn.prepareStatement("select * from student;");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Id "+rs.getInt(1));
				System.out.println("Name "+rs.getString(2));
				System.out.println("City "+rs.getString(3));
				System.out.println("");
				
			}
			
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
