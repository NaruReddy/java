import java.util.*;
public class ArrayListDemo1 
{
	public static void main(String arg[])
	{
		//List Collection class Object
		ArrayList list=new ArrayList();
		
		//Adding the objects to the Collection
		list.add("Gagan");
		list.add("Suresh");
		list.add("Vinod");
		
		list.add(100);
		list.add(200);
		
		list.add(new Student("S1001","Sunil","Mumbai"));
		list.add(new Student("S1002","Kiran","Mumbai"));
		list.add(new Student("S1003","Anil","Chennai"));
		
		for(Object element:list)
		{
			if(element instanceof String)
			{
				String str=(String)element;
				System.out.println(str);
			}
			else if(element instanceof Integer)
			{
				Integer o1=(Integer)element;
				System.out.println(o1);
			}
			else
			{
				Student ob1=(Student)element;
				System.out.println(ob1);
			}
			
		}
		
		
	}
}

