//Write a Java Program to find smallest among two numbers.
import java.util.Scanner;
public class smallest 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //condition checking
        if(a>b)
        {
            System.out.printf("%d is the smallest.",b);
        }
        else
        {
            System.out.printf("%d is the smallest.",a);
        }
    }
    
}
