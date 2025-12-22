//Write a Java Program to check whether a number is positive or negative.

import java.util.Scanner;

public class posorneg 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        //compute
        String result=(num>0)?"\"Positive\"":"\"Negative\"";
        //output
        System.out.println("The given number is "+result);
    }
}
