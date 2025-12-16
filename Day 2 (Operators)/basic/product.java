//Write a Java Program to print product of two numbers.

import java.util.Scanner;

public class product 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //take user input
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("The product : "+product);
    }
}
