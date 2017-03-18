import java.util.Scanner;
public class EvenOddProgram {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	n = sc.nextInt();
	if(n%2==0)
		System.out.println("Given "+n+" is an even number");
	else
		System.out.println("Given "+n+" is not an even number");
}
}
