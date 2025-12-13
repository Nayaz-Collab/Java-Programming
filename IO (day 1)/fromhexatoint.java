//Write a Java Program to print the given hexadecimal number in integer format.

import java.util.Scanner;

public class fromhexatoint 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter Hexadecimal value : ");
        Scanner sc=new Scanner(System.in);
        String hex=sc.next();
        //compute
        int intdec=Integer.parseInt(hex, 16);
        //output
        System.out.printf("The integer format of %s : %d",hex,intdec);

    }
}
