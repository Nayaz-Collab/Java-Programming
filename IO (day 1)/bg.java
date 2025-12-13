//Java Program to print your blood group.
import java.util.Scanner;
public class bg 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your blood group : ");
        String bloodgrp=sc.next();
        //output
        System.out.println("Blood group : "+bloodgrp);
    }    
}
