//Write a Java Program to print the character for the given ASCII value.
import java.util.Scanner;
public class asciiChar 
{
    public static void main(String[] args)
    {
        //input user
        System.out.print("Enter ASCII value : ");
        Scanner sc=new Scanner(System.in);
        int asc=sc.nextInt();
        //finding char using typecasting
        char a=(char)asc;
        //result
        System.out.printf("The character value of %d : %c",asc,a);
    }
}
