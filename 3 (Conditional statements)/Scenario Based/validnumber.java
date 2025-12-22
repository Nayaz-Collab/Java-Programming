//Write a java program to validate a mobile number . 
// If it has 10 digits print “Valid Number” otherwise print “Invalid Number”.

import java.util.Scanner;

public class validnumber 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter phone number : ");
        String num=sc.next();
        //condition check
        if(num.length()==10 && num.matches("\\d+"))
        {
            System.out.println("Valid Number");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}
