
public class Abstract1 extends AbstractClass {
 
	public static void main(String[] args) {
		AbstractClass ob = new Abstract1();
		ob.show(3,4);
		ob.area(3,4);
	}
	
	public double area(int b, int h) {
		double c = 0.5 * b * h;
		System.out.println(c);
		return c;
	}
}
