//Write a java program to display mobile battery status (full, moderate, low).

import java.util.Scanner;

public class batteryStatus 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Battery percentage : ");
        int percent=sc.nextInt();
        //condition check
        if(percent>=85)
        {
            System.out.println("Battery Full");
        }
        else if(percent>=40 && percent<100)
        {
            System.out.println("Battery Moderate");
        }
        else
        {
            System.out.println("Battery Low");
        }
    }    
}
