import java.io.*;
public class SerializationObjectWrite implements java.io.Serializable{
public static void main(String[] args) {
	try
	{
		FileOutputStream fos = new FileOutputStream("c://Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee("E567", "Narendra Reddy", "Hyderabad");
		//oos.writeObject(emp);
		oos.writeObject(emp);
		System.out.println("Object is written");
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised" +e);
	}
}
}