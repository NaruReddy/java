import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
@SuppressWarnings("unused")
public class SerializationObjectRead 
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fos=new FileInputStream("c://Employee.txt");
			@SuppressWarnings("resource")
			ObjectInputStream oos=new ObjectInputStream(fos);
			//Employee emp = new Employee("E567", "Narendra Reddy", "Hyderabad");
			//Employee ob=(Employee)oos.readObject();
			Object ob = oos.readObject();
			System.out.println(ob);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
