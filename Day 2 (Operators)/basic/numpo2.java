//Write a Java Program to check if a number is power of 2 using bitwise AND.

import java.util.Scanner;

public class numpo2 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       //user input
       System.out.print("Enter a number to check if it is a power of 2 : ");
       int num=sc.nextInt();
       //checking
       int result=num&(num-1);
       //output
       System.out.println((result!=0)?"Not a power of 2":"Yes, it is a power of 2"); 
    }  
}
