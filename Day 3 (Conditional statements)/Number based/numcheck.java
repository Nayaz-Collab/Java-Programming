//check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class numcheck 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition checking
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0) 
        {
            System.out.print("Negative");    
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
