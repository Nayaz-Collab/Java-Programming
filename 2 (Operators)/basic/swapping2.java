//Write a Java Program to swap two numbers without using a third variable.
import java.util.Scanner;
public class swapping2
{
    public static void main(String args[])
    {
        //take user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Before swapping: num1 : "+num1+", num2 : "+num2);
        //implementing arithmetic operation to swap values of variables without third variable.
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        //print
        System.out.println("after swapping: num1 : "+num1+", num2 : "+num2);
    }
}