//check whether a number is divisible by both 2 and 5 but not by 8.
import java.util.Scanner;
public class div2n5not8 
{
    public static void main(String[] args)
    
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numner : ");
        int num=sc.nextInt();
        //condition check
        if(num%2==0 && num%5==0)
        {
            if(num%8!=0)
            {
                System.out.println(num+" is divisible by both 2 and 5 but not by 8.");
            }
            else
            {
                System.out.println(num+" is divisible by both 2, 5 and 8.");
            }
        }
        else
        {
            System.out.println("It is not divisible by 2 or 5.");
        }
    }
}
