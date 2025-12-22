//Write a Java Program to print the cube of a number.
import java.util.Scanner;
public class cb
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to cube : ");
        int num=sc.nextInt();
        //compute
        int result=num*num*num;
        //output
        System.out.println("The cubic result : "+result);
    }    
}
