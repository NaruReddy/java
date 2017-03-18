
public abstract class AbstractClass {

	int base;
	int height;
	public void variableDeclaration(int b, int h)
	{
		base = b;
		height = h;
	}
	void show(int b, int h)
	{
		System.out.println("Given Base is:"+b);
		System.out.println("Given Height is:"+h);
	}

	public abstract double area(int b, int h);
}
