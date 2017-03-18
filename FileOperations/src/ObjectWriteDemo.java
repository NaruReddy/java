
import java.io.*;
public class ObjectWriteDemo 
{
	public static void main(String arg[])
	{
		
		try
		{
			FileOutputStream fo=new FileOutputStream("c:\\Employee.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			
			Employee emp=new Employee("E1001","Suresh","Mumbai");
			
			os.writeObject(emp);
			
			System.out.println("Object is Written");
			
			FileInputStream fos=new FileInputStream("c:\\Employee.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			
			Employee ob=(Employee)oos.readObject();
			
			System.out.println(ob);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
		
	}

}

