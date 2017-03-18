package Lesson3;

public class StaticKeyword {
int a = 20;
static int b=30;

public static void display()
{

 System.out.println(b);
}
public int show()
{
	 int b = 20;
	 return b;
}
public static void main(String args[])
{
//StaticKeyword key = new StaticKeyword();
//StaticKeyword ob = new StaticKeyword();
//System.out.println("Obj1:"+key.a);
//System.out.println("Obj2:"+key.b);
display(); //no need to retrieve through object as the method is a static
//System.out.println(ob.show());
}
}