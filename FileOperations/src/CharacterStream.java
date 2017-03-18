import java.io.*;
public class CharacterStream {
public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		FileReader fr = new FileReader("c://Employee.txt");
		//int avl = fr.available(); //Not possible to find length
         char buff[] = new char[120];
         fr.read(buff);
         String str = new String(buff);
         System.out.println(str);
         //System.out.println(buff);
         
	} 
}
