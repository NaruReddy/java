package Lesson3;

public class UseCallBack implements Interface{

	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		System.out.println("Narendra Reddy");
	}
	public static void main(String[] args) {
		UseCallBack ob = new UseCallBack();
				ob.callBack();
	}
}
