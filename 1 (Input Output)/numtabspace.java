//Write a Java Program to print two numbers with a tab space between them.
import java.util.Scanner;
public class numtabspace 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //output format with Tab space
        System.out.printf("The numbers with Tab space : %d\t\t%d",num1,num2);
    }    
}
