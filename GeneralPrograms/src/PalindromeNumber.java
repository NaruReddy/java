import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
	int sum = 0, rem, n, temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	n = sc.nextInt();
	temp=n;
	while(n!=0)
	{
		rem = n%10;
		sum = (sum*10)+rem;
		n=n/10;
		}
	if(sum==temp)
		System.out.println("Given number is a Palindrome number");
	else
		System.out.println("Sorry it is not a Palindrome Number");
}
}
