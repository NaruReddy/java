package Lesson3;

public abstract class Abstractkeyword {
public int add(int v1,int v2)
{
	int v3 = v1 + v2;
	System.out.println(v3);
	return v3;
}
public abstract double narendra(int v3,int v4);//even if we take as v3, v4 it's doesn't throw any error
                // bcos abstract method considers it as other variable, unlike we declared like v3 = v1 + v2;
                //in normal class
}


