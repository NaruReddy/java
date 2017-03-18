
public class ExtendingThreadClass extends Thread
{
    public void run()
    {
    	for(int i=1;i<=10;i++)
    	{
    	System.out.println(Thread.currentThread().getName());
   		System.out.println("i:" +i);
    	}
    }
    public static void main(String[] args) {
		ExtendingThreadClass etc = new ExtendingThreadClass();
		System.out.println(etc.isAlive());
		etc.start();
		System.out.println(etc.isAlive());
		ExtendingThreadClass etc2 = new ExtendingThreadClass();
		etc2.start();
	}
}