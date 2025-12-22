//Write a Java Program to find the greatest of three numbers.

import java.util.Scanner;

public class greatestofthree
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three integers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        //compute greatest
        int result=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;//nested ternery
        //output
        System.out.println("The greatest : "+result);
    }
}
