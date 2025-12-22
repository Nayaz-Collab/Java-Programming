//Write a Java Program to print the square of a number.

import java.util.Scanner;
public class sq
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to square : ");
        int num=sc.nextInt();
        //compute
        int result=num*num;
        //output
        System.out.println("The Squared result : "+result);
    }    
}
