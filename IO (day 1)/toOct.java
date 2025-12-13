//Q8. Write a Java Program to print the given integer number in octal format.
import java.util.Scanner;
public class toOct 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter an Integer : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //output
        System.out.printf("The octal format of %d : %o",num,num);
    }
}
