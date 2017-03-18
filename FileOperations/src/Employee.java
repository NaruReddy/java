import java.io.*;
public class Employee implements java.io.Serializable{
	String empid, empname, address;
	public Employee(String eid, String ename, String addr) {
       this.empid = eid;
       this.empname = ename;
       this.address = addr;
	} 
	public String toString()
	{
	return "Employee Id:" +empid+ " Employee Name:" +empname+ "Employee Address:" +address; 
	}

}

