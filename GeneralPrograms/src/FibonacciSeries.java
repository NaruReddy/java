import java.util.Scanner;
public class FibonacciSeries {
@SuppressWarnings("resource")
public static void main(String[] args) {
	int n1=0, n2 = 1, n3;
	int i,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	c = sc.nextInt();
	System.out.println(n1+ " " +n2);
	for(i=2;i<=c;i++)
	{
		n3 = n1 + n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
	}
}
}
