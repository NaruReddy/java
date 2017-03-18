import java.util.Scanner;
@SuppressWarnings("unused")
public class ReverseNumber {
public static void main(String[] args) {
	int rem, sum = 0, n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value");
	n = sc.nextInt();
	while(n!=0)
	{
		rem=n%10;
		sum = (sum * 10) + rem;
		n = n/10;
	}
	System.out.println("Reverse of a Number is:" +sum);
}
}
