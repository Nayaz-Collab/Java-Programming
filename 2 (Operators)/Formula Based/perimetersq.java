//Write a Java Program to find the perimeter of a square.
import java.util.Scanner;
public class perimetersq 
{
   public static void main(String[] args)
   {
    //input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of a side : ");
    double side=sc.nextDouble();
    //perimeter
    double perimeter=side*4;
    //output
    System.out.printf("The perimeter of square with side %.2f : %f",side,perimeter);
   } 
}
