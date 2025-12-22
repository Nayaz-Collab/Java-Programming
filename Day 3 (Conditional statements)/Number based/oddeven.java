//Write a Java Program to check odd or even.

import java.util.Scanner;

public class oddeven 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition checking
        if(num%2==0)
        {
            System.out.print(num+" is even");
        }
        else
        {
            System.out.print(num+" is odd");
        }
    }    
}
