//Write a java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.

import java.util.Scanner;

public class weatherCondition 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        double temp=sc.nextDouble();
        //condition checking
        if(temp<=10)
        {
            System.out.println("Cold");
        }
        else if(temp>10 && temp<=25)
        {
            System.out.println("Pleasant");
        }
        else if(temp>25 && temp<35)
        {
            System.out.println("Hot");
        }
        else
        {
            System.out.println("Heatwave");
        }
    }    
}
