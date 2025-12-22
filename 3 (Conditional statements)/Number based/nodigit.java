//check whether a number is a single-digit, two-digit, or three-digit number.
import java.util.Scanner;
public class nodigit 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition check
        num=(num<0)?-num:num;
        if(num>=0 && num<=9)
        {
            System.out.println("Single-digit");
        }
        else if(num>=10 && num<=99)
        {
            System.out.println("Two-digit");
        }
        else if(num>=100 && num<=999)
        {
            System.out.println("three-digit");
        }
        else
        {
            System.out.println("More than three digit");
        }
    }    
}
