//Write a Java Program to print the given integer number.
import java.util.Scanner;
public class printint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //input
        System.out.print("Enter integer : ");
        int num=sc.nextInt();
        //output
        System.out.println("The given number : "+num);
    }
}