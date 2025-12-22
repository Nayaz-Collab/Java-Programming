//check whether the last digit of a number is odd or even.
import java.util.Scanner;
public class lastdigitoddeven
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //condition checking
        int last=num%10;
        if(last%2==0)
        {
            System.out.printf("%d : Even",last);
        }
        else
        {
            System.out.printf("%d : Odd",last);
        }
    }
}