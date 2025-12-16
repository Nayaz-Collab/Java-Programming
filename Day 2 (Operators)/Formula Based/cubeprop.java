//Write a Java Program to find surface area, volume, and perimeter of a cube.

/*
Surface Area = 6 × side²
Volume = side³
Perimeter (sum of all edges) = 12 × side
 */

import java.util.Scanner;
public class cubeprop 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of side of the triangle : ");
        double side=sc.nextDouble();
        //computing surface area, volume, perimeter
        double surfarea=6*(side*side);
        double vol=(side*side*side);
        double perimeter=12*side;
        //result
        System.out.printf("The surface area : %.3f\nVolume : %.3f\nPerimeter : %.3f",surfarea,vol,perimeter);
    }    
}
