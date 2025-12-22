//check whether the first digit of a 3-digit number is odd or even.

import java.util.Scanner;

public class firstdigoddeven 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three digit number : ");
        int n=sc.nextInt();
        if(n>=100 && n<=999)
        {
            n/=10;
            n/=10;
            if(n%2==0)
            {
                System.out.println("First digit "+n+" is Even");
            }
            else
            {
                System.out.println("First digit "+n+" is Odd");
            }
        }
        else
        {
            System.out.println("Not a three digit number");
        }
    }    
}
