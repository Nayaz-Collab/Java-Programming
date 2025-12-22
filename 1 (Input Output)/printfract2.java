//Write a Java Program to print the given fractional number in 2-digit decimal format.
import java.util.Scanner;
public class printfract2 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter fractional number : ");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        //output
        System.out.printf("The given fractional number : %.2f",f);
    }
}
