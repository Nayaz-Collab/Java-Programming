//Write a Java Program to print pass/fail result based on marks.

import java.util.Scanner;

public class passorfail 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter your mark out of 100 : ");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        //compute
        String result=(mark>40)?"Passed":"Failed";
        //output
        System.out.println("You have "+result);
    }
}
