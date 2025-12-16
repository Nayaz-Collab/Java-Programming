//Write a Java Program to print sum of two numbers.
import java.util.Scanner;
public class sum 
{
    public static void main(String[] args)
    {
        //get user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition of two numbers : "+(a+b));
    }
}
