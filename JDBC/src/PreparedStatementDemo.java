import java.sql.*;
import java.util.Scanner;
public class PreparedStatementDemo {
@SuppressWarnings("unused")
public static void main(String[] args) {
	try
	{
		Class.forName("org.h2.Driver");
		Connection cn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "narendra", "narendra");
		Statement st = cn.createStatement();
		PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?)");
		int stuid;
		String stuname;
		int stuage;
		int stuphone;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		stuid = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Student Name");
		stuname = sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Student Age");
		stuage = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Student Phone");
		stuphone = sc3.nextInt();
		ps.setInt(1,stuid);
		ps.setString(2, stuname);
		ps.setInt(3, stuage);
		ps.setInt(4, stuphone);
		int row_eff=ps.executeUpdate();
		
		if(row_eff>0)
			System.out.println("Row Inserted");
		else
			System.out.println("Problem Occured");
		
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}
}
}
