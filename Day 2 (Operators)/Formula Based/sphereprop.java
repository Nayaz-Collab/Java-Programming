//Write a Java Program to find surface area and volume of a sphere.

/*
Surface Area = 4 × π × radius²
Volume = (4/3) × π × radius³
 */

import java.util.Scanner;
public class sphereprop 
{
    static final float pi=3.14f;
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of the Sphere : ");
        double r=sc.nextDouble();
        //calculating
        double surfarea=4*pi*r*r;
        double vol=(4/3)*pi*r*r;
        //output
        System.out.printf("The Surface Area : %.2f\nVolume : %.2f",surfarea,vol);
    }
}
