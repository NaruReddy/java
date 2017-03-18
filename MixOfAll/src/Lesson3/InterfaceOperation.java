package Lesson3;
	public class InterfaceOperation implements Calculator 
	{

		@Override
		public int add(int v1, int v2) 
		{
			return v1+v2;
		}

		@Override
		public int mul(int v1, int v2) 
		{	
			return v1*v2;
		}

		@Override
		public void show() 
		{
			System.out.println("Addition Result :"+add(10,20));
			System.out.println("Multiplication Result :"+mul(10,20));
		}
		
		public static void main(String arg[])
		{
			new InterfaceOperation().show();
		}

	}
