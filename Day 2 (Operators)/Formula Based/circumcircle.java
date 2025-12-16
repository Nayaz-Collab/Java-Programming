//Write a Java Program to find the circumference of a circle
import java.util.Scanner;
public class circumcircle 
{
    static final float pi=3.14f;
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter radius of the circle : ");
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();
        //circumference 
        double circum=2*pi*rad;
        //output
        System.out.printf("The circumference of the circle : %.3f",circum);
    }    
}
