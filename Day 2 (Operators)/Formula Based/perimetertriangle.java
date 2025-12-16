//Write a Java Program to find the perimeter of a triangle.
import java.util.Scanner;
public class perimetertriangle 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three sides of the rectangle : ");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        //primeter = side1+side+side3
        double perimtr=side1+side2+side3;
        //output
        System.out.printf("The perimeter of triangle : %.3f",perimtr);
    }
}
