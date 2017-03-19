
public class Pattern3 {
public static void main(String[] args) {
	int i,j,k,odd = 1;
	int noOfSpaces = 3;
	for(i=1;i<=4;i++)
	{
		k = 0;
		for(j=1;j<=noOfSpaces;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=odd;j++)
		{
			if(j<=i)
			{
			   k = k + 1;
			}
			else
			{
				k = k - 1;
			}
			System.out.print(k);
			}
		System.out.println();
		odd = odd + 2;
		noOfSpaces = noOfSpaces - 1;
	}
}
}
