package Basic_Calls;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallbleEx2 {

	public static void main(String[] args) throws SQLException {
		try
		( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice","root","root");
		
		 CallableStatement cs = con.prepareCall("{call getTotalStudents(?)}");)
		{
			cs.registerOutParameter(1, Types.INTEGER);

			cs.execute();

			int total = cs.getInt(1);

			System.out.println("Total Students: " + total);

	}

}
}
