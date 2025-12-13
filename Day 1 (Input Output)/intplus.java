//print an integer with a plus sign (+) before it.
import java.util.Scanner;
public class intplus 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //input
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //output with plus sign
        System.out.printf("Number with sign : +%d",num);
    }
}
