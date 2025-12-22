//Q11.Write a java program to apply % of discount based on purchase amount.

import java.util.Scanner;

public class discountpercent 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bill amount : ");
        double bill=sc.nextDouble();
        double discounted=0;
        //condition
        if(bill>50000)
        {
            discounted=30;
        }
        else if(bill>35000)
        {
            discounted=20;
        }
        else if(bill>20000)
        {
            discounted=10;
        }
        else if(bill>10000)
        {
            discounted=5;
        }
        else if(bill>5000)
        {
            discounted=2;
        }
        else
        {
            System.out.println("No discount...");
        }
        if(discounted>0)
        {
            double discounted_price=bill-((discounted/100.0)*bill);
            System.out.println("Final price : "+discounted_price);
        }
        else
        {
            System.out.println("Final price : "+bill);
        }
        
    }
}
