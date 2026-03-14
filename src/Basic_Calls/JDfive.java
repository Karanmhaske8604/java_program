package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDfive {

	public static void main(String[] args) throws SQLException {
		// All or Nothing Principle =>Commit or RollBack.
		
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class","root","root");
	//System.out.println(con);
	Statement stmt=con.createStatement();
	
	con.setAutoCommit(false);
	
	stmt.addBatch("insert into students values(1,'ABC','abc@gmail.com');");
	stmt.addBatch("insert into students values(2,'XYZ','xyz@gmail.com');");
	stmt.addBatch("insert into students values(2,'PQR','pqr@gmail.com');");
	stmt.addBatch("insert into students values(3,'LMN','lmn@gmail.com');");
	
	try {
	stmt.executeBatch();//all queries as one
	con.commit();//pushes changes to db

	}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	con.rollback();
	}
	con.close();
	
	
	

	}

}
