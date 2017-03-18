
public class ComparableClass implements Comparable<ComparableClass>{
int prodId;
String productName;
String prodCategory;
int price;
public ComparableClass(int pId, String pName, String pCat, int price) {
prodId=pId;
productName = pName;
prodCategory = pCat;
this.price = price;
}
public String toString() {
	return "Product Id:" +prodId+ "Product Name" +productName+ "Product Category" + prodCategory+ "Product Price" +price;
	
}
@Override
public int compareTo(ComparableClass o) {
	// TODO Auto-generated method stub
	return 0;
}

/*public int compareTo(ComparableClass obj) {
	if(this.prodId == obj.prodId)
		return 0;
	}*/


}