//Java Program to find greatest among two numbers.
import java.util.Scanner;
public class greatest 
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
            System.out.printf("%d is the greatest.",a);
        }
        else
        {
            System.out.printf("%d is the greatest.",b);
        }
    }
}
