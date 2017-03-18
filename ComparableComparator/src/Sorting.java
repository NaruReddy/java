import java.util.*;
public class Sorting {
public static void main(String[] args) {
	ArrayList<Product> list = new ArrayList<Product>();
	list.add(new Product(1001, "Samsung Galaxy S7", "5G Mobile" , 20000));
	list.add(new Product(1003,"Xiaomi Redmi 3","2G Mobile",18000));
	list.add(new Product(1004,"Apple iPhone 7","4G Mobile",65000));
	list.add(new Product(1002,"OnePlus 3T","3G Mobile",31999));
	
	Collections.sort(list,new SortNameWise());
	Collections.sort(list,new SortCatWise());
	
	for(Product p:list)
	{
		System.out.println(p);
	}
}

}
