//Write a Java Program to swap two numbers using a third variable.
import java.util.Scanner;
public class swapping1 
{
    public static void main(String args[])
    {
        //take user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("before swapping: num1 - "+num1+", num2 - "+num2);
        //swapping
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping: num1 - "+num1+", num2 - "+num2);
    }
}
