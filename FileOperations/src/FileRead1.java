import java.io.*;
public class FileRead1 
{
	public static void main(String arg[]) throws FileNotFoundException, IOException
	{
		//try
		//{
			FileInputStream fis=new FileInputStream("c:\\Employee.txt");
			
			//read the number of bytes in the file
			int avl =fis.available();
			System.out.println("The Number of Bytes :"+avl);
			
			//Creating a byte array to read the data from file
			byte buff[]=new byte[avl];
			
			//file stream wll read the data from 0th location until the avl position and it will store in buff
			fis.read(buff,0,avl);
			
			//Convert into the String
			String str=new String(buff);
			
			System.out.println(str);
			
			fis.close();
			
		//}
		//catch(Exception e)
		//{
			//System.out.println("Exception Arised:"+e);
		//}
	}
}
