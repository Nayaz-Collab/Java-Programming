//calculate cost price given selling price and loss
import java.util.Scanner;
public class costprice 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Selling Price SP : ");
        double sell=sc.nextDouble();
        System.out.print("Enter loss amount : ");
        double loss=sc.nextDouble();
        //computing Cost Price CP=SP+Loss
        double cp=sell+loss;
        //output
        System.out.println("The Cost Price CP : "+cp);
    }    
}
