import java.io.*;
import java.util.Scanner;
public class FileWrite {
public static void main(String[] args){
	try
	{
		@SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream("c://Employee.txt");
		String str=null;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		str=scan.next();
		for(int i=0;i<str.length();i++)
		{
			fos.write(str.charAt(i));
		}
		System.out.println("Content Written");
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised:" +e);
	}
}
}
