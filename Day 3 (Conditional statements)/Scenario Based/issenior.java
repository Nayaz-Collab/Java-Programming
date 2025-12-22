//Write a java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60)

import java.util.Scanner;

public class issenior 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();
        //condition check
        if(age>=60)
        {
            System.out.println("Eligible for senior citizen benefits");
        }
        else
        {
            System.out.println("Not eligible for senior citizen benefits");
        }
    }    
}
