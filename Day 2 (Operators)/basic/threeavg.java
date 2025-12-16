//Write a Java Program to calculate the average of three numbers.

import java.util.Scanner;

public class threeavg 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //input
        System.out.print("Enter three number : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        //compute average
        double result=(num1+num2+num3)/3.0;
        //output
        System.out.printf("The average : %.2f",result);
    }
}
