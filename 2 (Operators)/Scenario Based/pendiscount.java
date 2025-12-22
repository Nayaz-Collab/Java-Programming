//java Program to Pens Discount (Buy 5, Pay for 3) Find Total Amount need to pay
import java.util.Scanner;
public class pendiscount 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of pens : ");
        int pens=sc.nextInt();
        System.out.print("Enter unit price : ");
        int cost=sc.nextInt();
        //compute pay
        int to_pay=(pens/5)*3+(pens%5);
        int total=to_pay*cost;
        //output
        System.out.println("Amount to pay : "+total+" rupees.");

    }
}
