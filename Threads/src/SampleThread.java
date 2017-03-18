
public class SampleThread {
public static void main(String[] args) {
	Thread mt = Thread.currentThread();
	System.out.println("Name of the Thread:" +mt.getName());
	System.out.println("Priority of the Thread:" +mt.getPriority());
mt.setName("Narendra Reddy");
mt.setPriority(10);
System.out.println(mt.getName());
System.out.println(mt.getPriority());
}
}
