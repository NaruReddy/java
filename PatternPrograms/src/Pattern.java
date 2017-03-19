
public class Pattern {
public static void main(String[] args) {
	int odd = 1, i, j;
	for(i=1; i<=4; i++)
	{
		for(j=1;j<=odd; j++)
		{
			System.out.print(j);
		}
		System.out.println();
		odd = odd + 2;
	}


	//for(i=1;i<=4;i++)
	//{
		//for(j=1; j<=odd; j++)
		//{
			//System.out.print(i);
		//}
		//System.out.println();
		//odd = odd + 2;
	//}
}
}
