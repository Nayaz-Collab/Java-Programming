//Write a Java Program to find the area of a rectangle
// Area = length x width.
import java.util.Scanner;
public class arearect 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and breadth of the rectangle : ");
        int len=sc.nextInt();
        int wid=sc.nextInt();
        //compute area
        int area=len*wid;
        //output
        System.out.println("The area of rectangle : "+area);
    }    
}
