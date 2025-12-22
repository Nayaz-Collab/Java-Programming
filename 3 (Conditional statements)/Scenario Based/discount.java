//Write a java Program to calculate different discount for different Bill amount

import java.util.Scanner;

public class discount 
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
            discounted=5000;
        }
        else if(bill>35000)
        {
            discounted=2000;
        }
        else if(bill>20000)
        {
            discounted=1000;
        }
        else if(bill>10000)
        {
            discounted=550;
        }
        else if(bill>5000)
        {
            discounted=250;
        }
        else
        {
            System.out.println("No discount...");
        }
        if(discounted>0)
        {
            System.out.println("Final price : "+(bill-discounted));
        }
        else
        {
            System.out.println("Final price : "+bill);
        }
        
    }
}
