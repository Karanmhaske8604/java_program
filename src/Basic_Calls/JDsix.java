package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDsix {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		   con.setAutoCommit(false);
		   Statement stmt=con.createStatement();
		 
		   
		   stmt.addBatch("insert into student values(111,'abc','abc@gmail.com'),(444,'xyz','abc@gmail.com');");
		   stmt.addBatch("insert into student values(222,'abc','abc@gmail.com');");
		   stmt.addBatch("delete from student where id=333;");
		   
		   int count=1;
	int[] arr=stmt.executeBatch();
	 for(int i:arr)
	 {
		 System.out.println("no.of affected for each query"+i+"Query is:"+count);
		 count++;
	 }
	       con.commit();
			

	       con.close();
	}

	}

