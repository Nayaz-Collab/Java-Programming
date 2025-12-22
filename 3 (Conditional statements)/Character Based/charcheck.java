//Write a Java Program to check whether a character is a vowel or consonant.

import java.util.Scanner;

public class charcheck 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c=sc.next().charAt(0);
        //condition check
        int ascii=(int)c;
        char l=(ascii<97)?(char)(ascii+32):(char)ascii;//lowercase conversion
        if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')
        {
            System.out.println(c+" is a vowel");
        }
        else
        {
            System.out.println(c+" is a consonant");
        }
    }    
}
