//Write a Java Program to print the ASCII value of a character.
import java.util.Scanner;
public class charAscii 
{
    public static void main(String[] args)
    {
        //take user input
        System.out.print("Enter a character : ");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        //computing
        int asc=(int)a;
        //output
        System.out.printf("The ASCII value of %c : %d",a,asc);
    }
}
