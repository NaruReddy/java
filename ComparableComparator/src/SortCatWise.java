import java.util.*;
public class SortCatWise implements Comparator<Product> 
{

	@Override
	public int compare(Product o1, Product o2) 
	{
		return o1.prodCategory.compareTo(o2.prodCategory);
	}

}