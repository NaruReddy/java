import java.util.ArrayList;

public class ArrayListDemo extends ArrayList {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
		ArrayList List = new ArrayList();
	List.add("Narendra");
	List.add("Reddy");
	List.add("Dubba");
	List.add(222);
	List.add(333);
	List.add(5, "Cherry");
	
	//Object ob = List.get(1);
	//String str = (String)ob;
	//System.out.println(str);
	List.add(new ToStringClass(567, "Narendra", 22));
	List.add(new ToStringClass(237, "Charanya", 22));
	List.add(new ToStringClass(231, "Reddy", 20));
	for (Object element1 : List) {
		if(element1 instanceof String)
		{
			String str1 = (String)element1;
			System.out.println(str1);
		}
		else if(element1 instanceof Integer)
		{
			Integer abc = (Integer)element1;
			System.out.println(abc);
		}
		else 
		{
			ToStringClass ob1=(ToStringClass)element1;
			System.out.println(ob1);
		}
		
	}
}
}
