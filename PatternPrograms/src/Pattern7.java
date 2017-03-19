
public class Pattern7 {
public static void main(String[] args) {
	int i,j,k;
	int noOfSpaces = 4;
	for(i = 1; i<=5; i++)
	{
		for(j = 1; j<=noOfSpaces; j++)
		{
			System.out.print(" ");
		}
		for(k = 1; k <= i; k++)
		{
			System.out.print("*");
		}
		System.out.println();
		noOfSpaces = noOfSpaces - 1;
	}
}
}
