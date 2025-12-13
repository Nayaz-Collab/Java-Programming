//Write a Java Program to print the given message.
import java.util.Scanner;

public class message 
{
    public static void main(String args[])
    {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a message : ");
        String message=sc.nextLine();
        //output
        System.out.println("The given word : "+message);

    }   
}
