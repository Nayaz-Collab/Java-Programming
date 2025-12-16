//Write a java Program to print Price After Discount
import java.util.Scanner;
public class dis
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter original price : ");
        double ori_price=sc.nextDouble();
        System.out.print("Enter discount for that product : ");
        double discount=sc.nextDouble();
        //computing discounted price
        double dis=(discount*ori_price)/100;
        double discounted_Price=ori_price-dis;
        //output
        System.out.printf("The discount for the product will be %.2f",discounted_Price);
    }
}