//check whether the sum of three angles forms a valid triangle.
/*
angle1 + angle2 + angle3 = 180
AND all angles > 0
*/

import java.util.Scanner;

public class validtriangle1 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three angles of triangle : ");
        int angle1=sc.nextInt();
        int angle2=sc.nextInt();
        int angle3=sc.nextInt();
        //condition checking for valid triangle
        int angle_sum=angle1+angle2+angle3;
        if(angle1>0 && angle2>0 && angle3>0)
        {
            if(angle_sum==180)
            {
                System.out.println("\"Valid Triangle\"");
            }
            else
            {
                System.out.println("\"Not a Valid Triangle\"");
            }
        }
        else
        {
            System.out.println("\"Not a Valid Angle\"");
        }
    }
}
