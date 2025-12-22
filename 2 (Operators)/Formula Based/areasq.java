//Write a Java Program to find the area of a square.
import java.util.Scanner;
public class areasq 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int side=sc.nextInt();
        //compute
        int area=side*side;
        //output
        System.out.println("The area of square : "+area);
    }    
}
