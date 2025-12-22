//Write a Java Program to print the middle digit of a 3-digit number.

import java.util.Scanner;

public class middigit 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a three digit number : ");
        int num=sc.nextInt();
        int cpy=num;
        //compute
        cpy/=10;//remove last digit
        int result=cpy%10;//take second last or middle digit.
        //output
        System.out.printf("The middle digit of %d is %d",num,result);
    }
}
