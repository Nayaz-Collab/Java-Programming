//Write a Java Program to print quotient of two numbers.
import java.util.*;
public class quotent 
{
    public static void main(String args[])
    {
        //take input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter divident and divisor : ");
        int divident=sc.nextInt();
        int divisor=sc.nextInt();
        double result=divident/divisor;
        System.out.println("The quotent : "+result);
    }
}
