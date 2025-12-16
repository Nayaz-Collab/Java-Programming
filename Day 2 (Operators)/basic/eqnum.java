//Write a Java Program to check whether two numbers are equal (true/false).

import java.util.Scanner;

public class eqnum 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //compute equalness
        boolean result=num1==num2;
        String message=(result==true)?"The numbers are same : ":"The numbers are different : ";
        //result
        System.out.println(message+result);
    }    
}
