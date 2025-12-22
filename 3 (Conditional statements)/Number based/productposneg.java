//check whether the product of two numbers is positive or negative.

import java.util.Scanner;

public class productposneg 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //condition check
        int product=a*b;
        if(product>0)
        {
            System.out.println("Positive product : "+product);
        }
        else if(product<0)
        {
            System.out.println("Negative product : "+product);
        }
        else
        {
            System.out.println("Zero product : "+product);
        }
    }    
}
