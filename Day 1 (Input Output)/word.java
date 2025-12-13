//Write a Java Program to print the given word.

import java.util.Scanner;

public class word 
{
    public static void main(String args[])
    {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word=sc.next();
        //output
        System.out.println("The given word : "+word);

    }   
}
