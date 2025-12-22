//Write a Java Program to print all digits except the last digit of a given number N.
import java.util.Scanner;
public class exceptlastdigit 
{
    public static void main(String[] args)
    {
        //take user input
        System.out.print("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //remove last digit
        int result=N/10;
        //output
        System.out.println("Result : "+result);
    }    
}
