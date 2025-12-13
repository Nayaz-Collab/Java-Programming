//Write a Java Program to print the given octal number in integer format
import java.util.Scanner;
public class fromocttoint 
{
    public static void main(String args[])
    {
        //user input
        System.out.print("Enter Octal number : ");
        Scanner sc=new Scanner(System.in);
        String oct=sc.next();
        //compute
        int intdec=Integer.parseInt(oct, 8);
        //output
        System.out.printf("The Integer form of %s : %d",oct,intdec);
    }
}
