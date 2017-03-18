import java.util.HashSet;
import java.util.TreeSet;
public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add("Narendra");
	hs.add("Reddy");
	hs.add("Dubba");
	hs.add("Narendra");
	System.out.println(hs);
	TreeSet ts = new TreeSet(hs);
	System.out.println(ts);
}
}
