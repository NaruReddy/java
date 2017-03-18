import java.util.TreeSet;

public class EXpProduct implements Comparable<EXpProduct>
{
	int prodid,price;
	String prodname,category;
	
	public EXpProduct(int pid,int price,String pname,String cat)
	{
		prodid=pid;
		this.price=price;
		prodname=pname;
		category=cat;
	}
	
	public String toString()
	{/*
		System.out.println(prodid);
		System.out.println(price);
		System.out.println(category);
		System.out.println(prodname);*/
		return "Product ID:"+prodid+" Product Name:"+prodname+" Price:"+price+" Category:"+category;
	}

	//Logic written in this overridden method.

	@Override
	public int compareTo(EXpProduct nextobj) 
	{
		if(this.prodid==nextobj.prodid)
		{
			return 0;
		}
		else if(this.prodid>nextobj.prodid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[] args) {
		TreeSet<EXpProduct> ts=new TreeSet<EXpProduct>();
		
		ts.add(new EXpProduct(1001,19000,"Samsung 7","4GMobile"));
		ts.add(new EXpProduct(1001,19000,"Samsung 7","4GMobile"));
		ts.add(new EXpProduct(1004,21000,"Samsung 9","4GMobile"));
		ts.add(new EXpProduct(1002,17000,"Samsung 5","4GMobile"));
		
		//for(EXpProduct p:ts)
		//{
			//System.out.println(p);
		//}
	}
}
