//Write a Java Program to find surface area and volume of a cylinder.

/*
Curved Surface Area (CSA) = 2 × π × radius × height
Total Surface Area (TSA) = 2 × π × radius × (radius + height)
Volume = π × radius² × height
*/

import java.util.Scanner;
public class cylinprop 
{
    static final float pi=3.14f;
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter radius and height of cylinder : ");
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();
        double h=sc.nextDouble();
        //calculating
        double CSA=2*pi*rad*h;
        double TSA=2*pi*rad*(rad+h);
        double vol=pi*rad*rad*h;
        //output
        System.out.printf("CSA : %.2f\nTSA : %.2f\nVolume : %.2f",CSA,TSA,vol);
    }
}
