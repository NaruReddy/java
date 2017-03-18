
class Customer1
{
	int custid;
	String custname;

	public Customer1()
	{
	System.out.println("Default Constructor-Super Class");
	}

	public Customer1(int cid,String cname) //Overloaded Constructor
	{
	System.out.println("Overloaded Constructor-Super Class");
	custid=cid;
	custname=cname;
	}
}