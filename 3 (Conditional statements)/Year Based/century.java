//Java Program to check whether a given year is a century year or not.

import java.util.Scanner;

public class century 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int yr=sc.nextInt();
        //condition check
        if(yr%100==0)
        {
            System.out.print("Century Year");
        }
        else
        {
            System.out.print("Not a Century year");
        }
    }
}
