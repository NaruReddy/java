package Lesson3;

public class StaticMethod 
{
	//instance member
	 int var1 = 20;
	//static member 
	static int var2 =30 ;

	
	
	public static void display()
	{
		//var1=10; //Error as var1 is non static variable
		System.out.println("Displaying value:"+var2);
	}
	
	public static void main(String arg[])
	{
		StaticMethod ob1=new StaticMethod();
		
		System.out.println("After Creation of Ob1: Var1:"+ob1.var1);
		System.out.println("After Creation of Ob1: Var2:"+ob1.var2);
		
		StaticMethod ob2=new StaticMethod();
		
		System.out.println("After Creation of Ob2: Var1:"+ob2.var1);
		System.out.println("After Creation of Ob2: Var2:"+ob2.var2);
		
		StaticMethod ob3=new StaticMethod();
		
		System.out.println("After Creation of Ob3: Var1:"+ob3.var1);
		System.out.println("After Creation of Ob3: Var2:"+ob3.var2);
		
		System.out.println("With Class Name the Static Variabe:"+StaticMethod.var2);
		
	StaticMethod.display();
	}
}
