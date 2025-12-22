//check whether two numbers have the same last digit.

import java.util.Scanner;

public class samelastdigit 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        //check condition
        int last1=n1%10;
        int last2=n2%10;
        if(last1==last2)
        {
            System.out.println(n1+" and "+n2+" have same last digit");
        }
        else
        {
            System.out.println(n1+" and "+n2+" don't have same last digit");
        }
    }    
}
