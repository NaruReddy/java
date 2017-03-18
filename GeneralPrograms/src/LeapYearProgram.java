import java.util.*;
public class LeapYearProgram
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=ob.nextInt();
        if(year%100==0)//If year is a century year
        {
            if(year%400==0)
            {
                System.out.println(year+" is a Leap Year.");
            }
            else
            {
                System.out.println(year+" is not a Leap Year.");
            }
        }
        else
        {
            if(year%4==0)//If year is not a century year
            {
                System.out.println(year+" is a Leap Year.");
            }
            else
            {
                System.out.println(year+" is not a Leap Year.");
            }
        }
    }
}