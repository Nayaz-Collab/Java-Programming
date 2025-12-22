//check whether a character is a digit or not.
import java.util.Scanner;
public class isdigit 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c=sc.next().charAt(0);
        //condition checking for digit
        if(c>='0' && c<='9')
        {
            System.out.println(c+" is a digit");
        }
        else
        {
            System.out.println(c+" is not a digit");
        }
    }    
}
