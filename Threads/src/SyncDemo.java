
class Sync
{
	public synchronized static void showTransaction(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(Thread.currentThread().getName());
			System.out.println(arr[i]);
		}
	}
}
public class SyncDemo extends Thread
{
	String tran[]={"Enter Pin","Validate Amount","Process Tran","Update Tran","Complete"};
	public void run()
	{
		Sync.showTransaction(tran);
	}
	
	public static void main(String arg[])
	{
		SyncDemo T1=new SyncDemo();
		T1.setName("Harish");
		T1.start();
		
		SyncDemo T2=new SyncDemo();
		T2.setName("Vinod");
		T2.start();
	}
}






