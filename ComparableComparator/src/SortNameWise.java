import java.util.*;
public class SortNameWise implements Comparator <Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		return arg0.productName.compareTo(arg1.productName);
	}

}
