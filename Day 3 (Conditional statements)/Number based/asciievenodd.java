//check whether the ASCII value of a character is even or odd.

import java.util.Scanner;

public class asciievenodd 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c=sc.next().charAt(0);
        //condition check
        int ascii=(int)c;
        if(c%2==0)
        {
            System.out.println("\"Even\" ASCII value : "+ascii);
        }
        else
        {
            System.out.println("\"Odd\" ASCII value : "+ascii);
        }
    }    
}
