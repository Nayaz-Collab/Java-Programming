//Write a Java Program to find the perimeter of a rectangle.
import java.util.Scanner;
public class perimeterrect 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and width of Rectangle : ");
        double len=sc.nextDouble();
        double wid=sc.nextDouble();
        //perimeter
        double perirect=2*(len+wid);
        //output
        System.out.printf("The perimeter of the rectangle : %.3f",perirect);
    }
}
