//Write a java program to display mobile Battery Check – "Low Battery", "50% Consumed", or "Battery Full".

import java.util.Scanner;

public class battery 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Battery percent : ");
        int batterypercent=sc.nextInt();
        if(batterypercent<50)
        {
            System.out.print("\"50% Consumed\"");
            if(batterypercent<=20)
            {
                System.out.println(" \"Low Battery\"");
            }
        }
        else if(batterypercent==100)
        {
            System.out.println("\"Battery Full\"");
        }
        else
        {
            System.out.println("\"Battery not low\"");
        }
    }
}
