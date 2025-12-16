//Write a Java Program to print the absolute value of a number.
import java.util.Scanner;
//import java.math.*;
public class absnum 
{
    public static void main(String args[])
    {
        //user input
        System.out.print("Enter any decimal number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //compute
        //int result=Math.abs(num); using math method
        int result=(num<0)?(~num)+1:num;//using bitwise
        //output
        System.out.println("The absolute number : "+result);
    }    
}
