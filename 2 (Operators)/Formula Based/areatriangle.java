//Write a Java Program to find the area of a triangle.
import java.util.Scanner;
public class areatriangle 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base of the triangle : ");
        double base=sc.nextDouble();
        System.out.print("Enter height of the triangle : ");
        double height=sc.nextDouble();
        //compute the area
        double area=(base*height)/2.0;
        //output
        System.out.printf("The area of triangle : %.3f",area);
    }
}
