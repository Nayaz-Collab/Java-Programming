//check whether a number is divisible by either 3 or 7.

import java.util.Scanner;

public class divby3o5 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition checking
        if(num%3==0)
        {
            if(num%5==0)
            {
                System.out.println(num+" is divisible by both 3 and 5.");
            }
            else
            {
                System.out.println(num+" is divisible by 3.");
            }
        }
        else
        {
            if(num%5==0)
            {
                System.out.println(num+" is divisible by 5.");
            }
            else
            {
                System.out.println(num+" is not divisible by both 3 and 5.");
            }
        }
    }    
}
