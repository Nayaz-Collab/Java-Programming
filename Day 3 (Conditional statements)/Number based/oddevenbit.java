//Java Program to check odd or even using bitwise operator.

import java.util.Scanner;

public class oddevenbit 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //condition checking
        if((num&1)==0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+" is odd");
        }
    }
}
