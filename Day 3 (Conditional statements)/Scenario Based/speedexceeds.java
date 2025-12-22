//Q15.Write a java program to check whether vehicle speed exceeds 100 km/h.

import java.util.Scanner;

public class speedexceeds 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Vehicle speed : ");
        int speed=sc.nextInt();
        //condition check
        if(speed>100)
        {
            System.out.println("Vehicle speed is exceeding 100 km/h...");
        }
        else
        {
            System.out.println("Vehicle speed is under 100 km/h...");
        }
    }    
}
