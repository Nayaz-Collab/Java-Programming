//Write a java program to check if temperature is above 100 (fever check).

import java.util.Scanner;

public class fevercheck 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter body temperature : ");
        double temperature=sc.nextDouble();
        //condition check
        if(temperature>100)
        {
            System.out.println("\"Temperatur is high, fever\"");
        }
        else
        {
            System.out.println("Temperature normal");
        }
    }    
}
