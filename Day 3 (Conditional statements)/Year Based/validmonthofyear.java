//check whether a given year and month combination is valid and print the number of days in that month.

import java.util.Scanner;

public class validmonthofyear 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year : ");
        int year=sc.nextInt();
        System.out.print("Enter Month : ");
        int month=sc.nextInt();
        //condition check
        if(year>0 && month>0 && month<=12)
        {
            System.out.println("Valid month and year:-");
            switch(month)
            {
                case 1,3,5,7,8,10,12:
                    System.out.println("No. of days : 31 days");
                    break;
                case 4,6,9,11:
                    System.out.println("No. of days : 30 days");
                    break;
                case 2:
                    if(year%400==0 || (year%4==0 && year%100!=0))
                    {
                        System.out.println("It is a leap year : 29 days");
                    }
                    else
                    {
                        System.out.println("It is not a leap year : 28 days");
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Not a Valid year or month");
        }   
    }
}
