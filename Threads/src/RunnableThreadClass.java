
public class RunnableThreadClass implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("i:" +i);
		}
		
	}
	public static void main(String[] args) {
		RunnableThreadClass rtarget = new RunnableThreadClass();
			Thread rtc = new Thread(rtarget);
			rtc.start();
			Thread rtc1 = new Thread(rtarget);
			rtc1.start();
	}

}
