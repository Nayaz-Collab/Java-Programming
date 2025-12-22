//Write a Java Program to find the area of a circle.
import java.util.Scanner;

public class areacircle 
{
    static final double pi=3.14;
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter radius of the circle : ");
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();
        //area
        double area=pi*rad*rad;
        //output
        System.out.printf("The area of the circle : %.3f",area);
    }    
}
