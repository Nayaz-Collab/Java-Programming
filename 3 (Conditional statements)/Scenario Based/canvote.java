//Write a java Program to check whether a person is eligible to vote (age ≥ 18)

import java.util.Scanner;

public class canvote 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();
        //condition check
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }    
}
