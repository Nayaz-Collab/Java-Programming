//check whether the first two digits and last two digits of a year are equal.

import java.util.Scanner;

public class fstlsteq 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter year : ");
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        //condition checking
        int first_two=yr/100;
        int last_two=yr%100;
        if(first_two==last_two)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }    
}
