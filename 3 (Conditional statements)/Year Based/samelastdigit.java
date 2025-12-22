//check whether two given years have the same last digit.

import java.util.Scanner;

public class samelastdigit 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter two years : ");
        Scanner sc=new Scanner(System.in);
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        //condition checking
        int last1=y1%10;
        int last2=y2%10;
        if(last1==last2)
        {
            System.out.print("Same last digit");
        }
        else
        {
            System.out.print("Different last digit");
        }
    }    
}
