import java.io.*;
public class FileRead {
public static void main(String[] args) throws Exception
{
	
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("c:\\Employee.txt");
		int avl = fis.available();
		System.out.println("The number of Bytes are:" +avl);
	
		byte a[] = new byte[avl];
		
		fis.read(a, 0, avl);
		String str = new String(a);
		System.out.println(str);
	
}
}
