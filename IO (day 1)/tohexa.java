//Write a Java Program to print the given integer number in hexadecimal format.

import java.util.Scanner;

public class tohexa
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Give an Integer number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //output
        System.out.printf("The Hexadecimal format of %d : %X",num,num);
    } 
}
