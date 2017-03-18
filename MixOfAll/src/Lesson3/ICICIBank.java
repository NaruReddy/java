package Lesson3;

public class ICICIBank extends Bank
{
	ICICIBank()
	{
		super("ICICI Bank","100001", "ICICI112");
	}
public static void main(String args[])
{
	ICICIBank i = new ICICIBank();
i.getDetails();
i.withDraw1(20000);
i.Deposit(200000);
}
}
