//Write a java program to print "Stop / Ready / Go" based on traffic light color.

import java.util.Scanner;

public class trafficsignal 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter traffic signal colour (red, green, yellow): ");
        String color=sc.next();
        //condition checking
        if(color.equals("red"))
        {
            System.out.println("\"STOP\"");
        }
        else if(color.equals("yellow"))
        {
            System.out.println("\"READY\"");
        }
        else if(color.equals("green"))
        {
            System.out.println("\"GO\"");
        }
        else
        {
            System.out.println("Invalid colour");
        }
    }    
}
