import java.util.Scanner;
@SuppressWarnings("unused")
public class SwappingProgram {
public static void main(String[] args) {
	int a, b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value");
	a = sc.nextInt();
	System.out.println("Enter b value");
	b = sc.nextInt();
	a = a + b;
	b = a - b;
	a = a - b;
System.out.println("After Swapping a & b values are:" +a+" " +b);
}
}
