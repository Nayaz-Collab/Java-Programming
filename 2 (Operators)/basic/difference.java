//Write a Java Program to print difference of two numbers.
import java.util.Scanner;
public class difference 
{
    public static void main(String args[])
    {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("The difference of two numbers : "+(num2-num1));
    }    
}
