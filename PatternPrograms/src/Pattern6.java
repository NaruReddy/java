
public class Pattern6 {
public static void main(String[] args) {
	int i, j, noOfSpaces = 4;
	for(i = 1;i<=5; i++)
	{
		for(j=1;j<=noOfSpaces;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
		noOfSpaces = noOfSpaces - 1;
	}
}
}