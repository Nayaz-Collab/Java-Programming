//print a character in single quotes
import java.util.Scanner;
public class charquot 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter a Character : ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        //output
        System.out.printf("The character in singlr quotes : \'%c\'",c);
    }  
}
