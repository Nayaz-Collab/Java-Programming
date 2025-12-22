//check whether a number is divisible by both 3 and 5.
import java.util.Scanner;
public class divby3n5
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num=sc.nextInt();
        //condition check
        if((num%3==0) && (num%5==0))
        {
            System.out.println(num+" is divisible by both 3 and 5");
        }
        else
        {
            System.out.println(num+" is not divisible by both 3 and 5");
        }
    }
}