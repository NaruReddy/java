import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	int sum = 0, rem, temp, n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a NUmber");
	n = sc.nextInt();
	temp=n;
	while(n!=0)
	{
		rem = n%10;
		sum = sum + (rem * rem * rem);
		n = n/10;
	}
	if(temp==sum)
		System.out.println("Given number is an Armstrong Number");
	else
		System.out.println("Given number is not an ARmstrong Number");
}
}
