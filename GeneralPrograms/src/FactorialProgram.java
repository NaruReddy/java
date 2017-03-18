import java.util.Scanner;
public class FactorialProgram {
public static void main(String[] args) {
	int fact = 1, n, i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value");
	n = sc.nextInt();
	for(i=1;i<=n;i++)
	{
		fact = fact * i;
	}
	System.out.println("Factorial of "+n+" value is:" +fact);
}
}
