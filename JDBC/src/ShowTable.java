import java.sql.*;
public class ShowTable {
public static void main(String[] args) {
	try
	{
	Class.forName("org.h2.Driver");
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}
	
	try(Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "narendra", "narendra");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from EMPLOYEE");)
	{
		while(rs.next())
		{
			System.out.println(rs.getInt("empid"));
			System.out.println(rs.getString("empname"));
			System.out.println(rs.getString("empsalary"));
			System.out.println(rs.getInt("empaddress"));
		}
		//st.close();
		//conn.close();
	}
	catch(SQLException s)
	{
		
	}
	
	
}
}
