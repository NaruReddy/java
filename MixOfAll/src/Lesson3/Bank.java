package Lesson3;

public class Bank {
private String BankName;
private String MICRNumber;
private String IFSCNumber;
public Bank(String BName, String MICRNo, String IFSCNo)
{
	BankName = BName;
	MICRNumber = MICRNo;
    IFSCNumber = IFSCNo;
}
public void getDetails()
{
System.out.print("Bank Name:" +BankName);
System.out.print("MICR Number:" +MICRNumber);
System.out.print("IFSC Code" +IFSCNumber);
}
public void withDraw1 (int amount) {
	System.out.println("Enter the withdrawal amount:" +amount);
}
public void Deposit(int amount) {
	System.out.println("Enter the amount to be Deposited:" +amount);
}
public void rateOfInterest(int amount) {
	System.out.println("1% is your Rate Of Interest mate");
}
}
