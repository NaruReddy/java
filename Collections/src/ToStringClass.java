
public class ToStringClass {
int sid;
String sname;
int c;
public ToStringClass(int sid, String sname, int c)
{
	this.sid= sid;
	this.sname = sname;
	this.c = c;
	
}
public String toString()
{
 return "Student ID:" +sid+ "Student name:" + sname + "Student Age:" + c;
}
public static void main(String[] args) {
	ToStringClass str = new ToStringClass(567, "Narendra", 22);
	System.out.println(str);
}
}