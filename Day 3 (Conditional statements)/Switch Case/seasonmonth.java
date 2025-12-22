//Write a Java Program using switch case to print the season based on month number.

import java.util.Scanner;

public class seasonmonth 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month number : ");
        int month=sc.nextInt();
        //condition checking for month
        switch (month) 
        {
            case 3,4,5:
                System.out.println("Summer");
                break;
            case 6,7,8,9:
                System.out.println("Monsoon");
                break;
            case 10,11:
                System.out.println("Post-Monsoon");
                break;
            case 12,1,2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Not a valid Month number...");
        }
    }    
}
