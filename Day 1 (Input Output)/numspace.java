//Write a Java Program to print two numbers with a space between
import java.util.Scanner;
public class numspace 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //output
        System.out.printf("Two numbers with space : %d %d",num1,num2);
    }    
}
