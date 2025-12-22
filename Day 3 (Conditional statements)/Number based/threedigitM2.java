//three digit number or not
import java.util.Scanner;
public class threedigitM2 
{
    public static void main(String[] args)
    {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        num=(num<0)?-num:num;
        //condition checking
        if(num>=100 && num<=999)
        {
            System.out.println(num+" is three digit.");
        }
        else
        {
            System.out.println(num+" is not three digit.");
        }
    }    
}
