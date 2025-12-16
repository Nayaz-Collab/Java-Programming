//Write a Java Program to print the sum of the first and last digit of a 3-digit number.

import java.util.Scanner;

public class sumlast 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //user input
        System.out.print("Enter three digit number : ");
        int num=sc.nextInt();
        //compute
        int last=num%10;//to take last digit
        num/=10;//to remove last digit
        num/=10;//to remove second last digit;
        int first=num;//now num contain only the first digit.
        int sum=first+last;//sum of first and last digit of a number.
        //output
        System.out.println("The sum of the first and last digit : "+sum);
    }   
}
