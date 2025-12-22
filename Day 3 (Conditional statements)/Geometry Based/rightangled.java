//Java Program to check whether a triangle is right-angled or not.
/*
Using Pythagoras theorem
a² + b² = c²
*/
import java.util.Scanner;
public class rightangled 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of three sides of triangle : ");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        //condition check
        if(s1*s1+s2*s2==s3*s3 || s2*s2+s3*s3==s1*s1 || s3*s3+s1*s1==s2*s2)
        {
            System.out.println("It is a right-angled triangle.");
        }
        else
        {
            System.out.println("It is not a right-angled triangle.");
        }
    }

}
