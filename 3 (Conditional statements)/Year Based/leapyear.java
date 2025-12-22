//Java Program to check whether a year is a leap year or not.

import java.util.Scanner;

public class leapyear 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int y=sc.nextInt();
        //conditional checking
        if(y%400==0 || (y%4==0 && y%100!=0))//checking valid century year.
        {
                System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
