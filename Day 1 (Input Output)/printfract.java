//Write a Java Program to print the given fractional number.
import java.util.Scanner;
public class printfract
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter fractional number : ");
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        //output
        System.out.println("The given fractional number : "+num);
    }
}