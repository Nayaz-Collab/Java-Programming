//java Program to Mangoes Discount (Buy 3 Get 1 Free) Find Total Amount need to pay
import java.util.Scanner;
public class mangodiscount 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of mangoes to buy : ");
        int mango=sc.nextInt();
        System.out.print("Unit price : ");
        double price=sc.nextDouble();
        //compute
        int paid=(mango/4)*3+(mango%4);
        double total=paid*price;
        //output
        System.out.println("Total Amount to pay : "+total+" Rupees.");
    }    
}
