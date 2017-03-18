package Lesson3;

public class FinalKeyword extends  FinalMethod{
public final int v2 = 100;
  void display()
{
	int v2 = 20;
 System.out.println(v2);
}
public static void main(String[] args) {
	FinalKeyword key = new FinalKeyword();
	key.display();
}
}
