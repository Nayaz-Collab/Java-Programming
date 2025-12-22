//check whether a character is alphabet or not.

import java.util.Scanner;

public class alpha 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c=sc.next().charAt(0);
        //condition check
        if(c>='A' && c<='Z' || c>='a' && c<='z')
        {
            System.out.println(c+" is an alphabet");
        }
        else
        {
            System.out.println(c+" is not a alphabet");
        }
    }    
}
