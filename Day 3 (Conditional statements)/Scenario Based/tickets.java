//Write a java program to assign ticket price based on passenger age (child, adult, senior).

import java.util.Scanner;

public class tickets 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age=sc.nextInt();
        //condition check
        if(age<13)
        {
            System.out.println("Child");
            System.out.println("Ticket price: 300");
        }
        else if(age<=60)
        {
            System.out.println("Adult");
            System.out.println("Ticket price: 500");
        }
        else
        {
            System.out.println("Senior");
            System.out.println("Ticket price: 400");
        }
    }    
}
