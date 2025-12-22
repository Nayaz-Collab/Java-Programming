//check whether the sum of two numbers is even or odd.

import java.util.Scanner;

public class oddevensum 
{
    public static void main(String[] args)
    {
        //input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two numbers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    //condition checking
    if((a+b)%2==0)
    {
        System.out.println("The sum is even : "+(a+b));
    }
    else
    {
        System.out.println("The sum is odd : "+(a+b));
    }
    }
}
