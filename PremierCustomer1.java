
class PremierCustomer1 extends Customer1
{
	int discount;

	public PremierCustomer1()
	{
	super(1001,"Harish");
	System.out.println("Default Constructor-Sub Class");
	discount=90;
	}

	public void displayDetail()
	{
	System.out.println("Customer ID:"+custid);
	System.out.println("Customer Name:"+custname);
	System.out.println("Customer discount:"+discount);
	}

	public static void main(String arg[])
	{
	PremierCustomer1 obj1=new PremierCustomer1();

	obj1.displayDetail();
	}
}