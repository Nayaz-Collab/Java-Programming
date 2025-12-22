//Write a java program to check pass/fail based on marks (marks ≥ 35 = pass).

import java.util.Scanner;

public class passfail 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks (out of 100) : ");
        int marks=sc.nextInt();
        //condition check
        if(marks<=35)
        {
            System.out.println("Oops! You have failed...");
        }
        else
        {
            System.out.println("You have Passed!");
        }
    }
}
