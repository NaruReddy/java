package Lesson3;

public interface Addition {
	int add(int v1,int v2);
}
 interface Multiplication
 {
	 int mul(int v1, int v2);
 }
  interface Calculator extends Addition, Multiplication
 {
	 void show();
 }