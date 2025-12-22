//check whether a character is uppercase, lowercase, digit, or special symbol.

import java.util.Scanner;

public class whatchar 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c=sc.next().charAt(0);
        //condition checking for uppercase, lowercase, digit, or special symbol
        if(c>='A' && c<='Z')
        {
            System.out.println(c+" is a Uppercase");
        }
        else if(c>='a' && c<='z')
        {
            System.out.println(c+" is a Lowercase");
        }
        else if(c>='0' && c<='9')
        {
            System.out.println(c+" is a digit");
        }
        else
        {
            System.out.println(c+" is a special symbol");
        }
    }    
}
