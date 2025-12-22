//check whether three sides form a valid triangle.
/*
a + b > c
b + c > a
a + c > b
*/

import java.util.Scanner;

public class validtriangle2 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        //condition check
        if(s1+s2>s3 || s2+s3>s1 || s1+s3>s2)
        {
            System.out.println("\"Valid Triangle\"");
        }
        else
        {
            System.out.println("\"Not a Valid triangle\"");
        }
    }    
}
