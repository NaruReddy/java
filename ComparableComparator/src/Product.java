import java.util.*;
public class Product {
	int productId;
	String productName;
	String prodCategory;
	int price;
	public Product(int pid, String pName, String pCategory, int price)
	{
		productId=pid;
		productName=pName;
		prodCategory=pCategory;
		this.price = price;
	}
public String toString() {
	return "Product Id:" +productId+ "Product Name:" +productName+ "Product Category:" +prodCategory+ "Product Price:"+price;
}
}
