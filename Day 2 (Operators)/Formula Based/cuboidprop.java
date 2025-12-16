//Write a Java Program to find surface area and volume of a cuboid.

/*
    Surface Area = 2 × (lw + lh + wh)
    Volume = length × width × height
*/

import java.util.Scanner;
public class cuboidprop 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length, breadth and height of the cuboid : ");
        double len=sc.nextDouble();
        double wid=sc.nextDouble();
        double ht=sc.nextDouble();
        //calculating
        double surfarea=2*(len+wid+ht);
        double volume=len*wid*ht;
        //printing
        System.out.printf("The Surface Area : %.3f\n",surfarea);
        System.out.println("The Volume : "+volume);
    }    
}
