
public class Pattern2 {
public static void main(String[] args) {
	int i, j, odd=1, k;
	for(i=1;i<=4;i++)
	{
		k=0;                                           //1
		for(j=1;j<=odd;j++)                            //121
		{                                              //12321  At this point both i and j values are equal 
			if(j<=i)                                   //so after we shud decrease j value
			{                                          //so for this we'll use k value
				k=k + 1;                               // if j<=i, we'll increment k value by 1;
			}                                          //if reverse we'll decrement by k and printing it. 
			else
			{
				k = k - 1;
			}
			System.out.print(k);
		}
		System.out.println();
		odd = odd + 2;
	}
}
}
