import java.sql.*;
public class JDBC1 {
public static void main(String[] args) {
	try
	{
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "narendra", "narendra");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from Customer");
		ResultSetMetaData rsmd = rs.getMetaData();
		int dd = rsmd.getColumnCount();
		for(int i=1;i<=dd;i++)
		{
			System.out.print(rsmd.getColumnName(i));
		}
		System.out.println();
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"     ");
			System.out.print(rs.getString(2)+"     ");
			System.out.print(rs.getString(3)+"      ");
			System.out.println(rs.getInt(4));
		}
		st.close();
		conn.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}
}
}
