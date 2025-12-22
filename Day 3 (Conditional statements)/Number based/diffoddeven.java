//check whether the difference between two numbers is even or odd.

import java.util.Scanner;

public class diffoddeven 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //difference
        int diff=num2-num1;
        diff=(diff<0)?-diff:diff;
        //condition checking
        if(diff%2==0)
        {
            System.out.printf("The difference \"%d\" is even",diff);
        }
        else
        {
            System.out.printf("The difference \"%d\" is odd",diff);
        }
    }    
}
