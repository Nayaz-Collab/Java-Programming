//check whether the last digit of a number is divisible by 3.

import java.util.Scanner;

public class lastdigdivby3 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition checking
        int last_digit=num%10;
        if(last_digit%3==0)
        {
            System.out.println(last_digit+" is divisible by three");
        }
        else
        {
            System.out.println(last_digit+" is not divisible by three");
        }
    }
}
