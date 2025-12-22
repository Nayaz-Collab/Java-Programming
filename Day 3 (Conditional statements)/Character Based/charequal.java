//check whether two characters are equal or not.

import java.util.Scanner;

public class charequal 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two characters : ");
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        //condition checking
        if(c1==c2)
        {
            System.out.println(c1+" and "+c2+" are equal");
        }
        else
        {
            System.out.println(c1+" and "+c2+" are not equal");
        }
    }    
}
