//Java Program to check in which quadrant a point (x, y) lies.
/*
1st Quadrant: x > 0, y > 0
2nd Quadrant: x < 0, y > 0
3rd Quadrant: x < 0, y < 0
4th Quadrant: x > 0, y < 0
Origin: x = 0, y = 0
*/

import java.util.Scanner;

public class quadrant 
{
    public static void main(String[] arga)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two points : ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x>0 && y>0)
        {
            System.out.println(x+" and "+y+" lie in first quadrant");
        }
        else if(x<0 && y>0)
        {
            System.out.println(x+" and "+y+" lie in second quadrant");
        }
        else if(x<0 && y<0)
        {
            System.out.println(x+" and "+y+" lie in third quadrant");
        }
        else if(x>0 && y<0)
        {
            System.out.println(x+" and "+y+" lie in fourth quadrant");
        }
        else
        {
            System.out.println(x+" and "+y+" lie in origin");
        }
    }    
}
