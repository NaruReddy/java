package Lesson3;

public class AxisBank extends Bank
{
	AxisBank()
	{
		super("AXIS BANK","100001" , "AXIS1001");
	}
	public void getDetails()
	{
		super.getDetails();
		System.out.println("Contact Details:" + 10001);
	}
public static void main(String[] arg)
{
	AxisBank a = new AxisBank();
	a.getDetails();
	a.withDraw1(10000);
	a.Deposit(5000);
}
}
