//Java Program to print two numbers in two lines

import java.util.Scanner;

public class numtwolines 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //output in two lines
        System.out.printf("%d\n%d",num1,num2);
    }    
}
