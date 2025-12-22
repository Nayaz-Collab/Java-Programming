//Write a Java Program to print remainder of two numbers.
import java.util.*;
public class remainder
{
    public static void main(String args[])
    {
        //take user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter divident and divisor : ");
        int divident=sc.nextInt();
        int divisor=sc.nextInt();
        int result=divident%divisor;
        //print result
        System.out.println("The remainder : "+result);
    }
}
