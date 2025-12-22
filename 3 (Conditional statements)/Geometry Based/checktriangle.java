//Write a Java Program to check whether a triangle is equilateral, isosceles, or scalene.
/*
Equilateral: a = b = c

Isosceles: any two sides equal
a = b OR b = c OR a = c

Scalene: all sides different
a ≠ b AND b ≠ c AND a ≠ c
*/

import java.util.Scanner;

public class checktriangle 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lenght of three side of the Triangle : ");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        //condition checking based on formula
        if(s1==s2 && s2==s3 && s1==s3)
        {
            System.out.println("Equilateral triangle.");
        }
        else if(s1==s2 || s2==s3 || s1==s3)
        {
            System.out.println("Isosceles triangle.");
        }
        else
        {
            System.out.println("Scalene triangle.");
        }
    }    
}
