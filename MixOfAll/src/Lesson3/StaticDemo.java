package Lesson3;

public class StaticDemo 
{
	//instance member
	int var1;
	//static member 
	static int var2;
	
	public StaticDemo() //Constructor 
	{
		var1++;
		var2++;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String arg[])
	{
		StaticDemo ob1=new StaticDemo();
		
		System.out.println("After Creation of Ob1: Var1:"+ob1.var1);
		System.out.println("After Creation of Ob1: Var2:"+ob1.var2);
		
		StaticDemo ob2=new StaticDemo();
		
		System.out.println("After Creation of Ob2: Var1:"+ob2.var1);
		System.out.println("After Creation of Ob2: Var2:"+ob2.var2);
		
		StaticDemo ob3=new StaticDemo();
		
		System.out.println("After Creation of Ob3: Var1:"+ob3.var1);
		System.out.println("After Creation of Ob3: Var2:"+ob3.var2);
		
	}
}


