//check whether four sides form a square or rectangle.
/*
Square:
a = b = c = d all four sides equal.

Rectangle:
a = c AND b = d AND a ≠ b parallel sides equal.
*/

import java.util.Scanner;

public class sqorrect 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of four sides : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        //condition checking for square or rectangle.
        if(a>0 && b>0 && c>0 && d>0)
        {
            if(a==b && b==c && c==d && a==d)
            {
                System.out.println("Its a \"Square\"");
            }
            else if(a==c && b==d && a!=b && c!=d)
            {
                System.out.println("Its a \"Rectangle\"");
            }
            else
            {
                System.out.print("Does not form a square or rectangle");
            }
        }
        else
        {
            System.out.println("Length or size cannot be zero");
        }
        
    }
}
