//Q20.Write a java program to Check 
// if vehicle speed exceeds 100 km/h.("Over-speeding! Fine imposed.","Speed iswithin limit")

import java.util.Scanner;

public class carspeed 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter speed (km/h): ");
        int speed=sc.nextInt();
        int limit=100;
        //condition check
        if(speed<=limit)
        {
            System.out.print("Speed is within limit");
        }
        else
        {
            System.out.print("Over-speeding! Fine imposed");
        }
    }    
}
