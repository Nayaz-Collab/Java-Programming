//calculate selling price, given cost price and profit.
import java.util.Scanner;
public class sellingprice 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Cost Price CP : ");
        double cost=sc.nextDouble();
        System.out.print("Enter profit : ");
        double profit=sc.nextDouble();
        //selling price CP+Profit
        double selling_price=cost+profit;
        //output
        System.out.println("Selling price : "+selling_price);
    }    
}
