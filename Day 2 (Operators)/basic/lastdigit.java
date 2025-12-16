//Write a Java Program to print the last digit of a given number N.

import java.util.Scanner;

public class lastdigit
{
    public static void main(String args[])
    {
        //take user input
        Scanner sc =new Scanner(System.in);
        System .out.print("Enter a number : ");
        int N=sc.nextInt();
        //last digit;
        int last=N%10;
        System.out.println("The last digit of "+N+" is "+last);
    }
}
