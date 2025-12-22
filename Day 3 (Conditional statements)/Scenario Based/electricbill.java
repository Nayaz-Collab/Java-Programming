//Write a java program to calculate electricity bill 
// using slab rates (0–100 free, 101–300 = ₹5/unit, >300 = ₹10/unit) 
// and apply surcharge if consumption exceeds 500 units.

import java.util.Scanner;

public class electricbill 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter units : ");
        int unit=sc.nextInt();
        //conditon check
        double bill=0;
        if(unit>=0 && unit<=100)
        {
            bill=0;
        }
        else if(unit>100 && unit<=300)
        {
            bill=(unit-100)*5;
        }
        else
        {
            bill=(200*5)+(unit-300)*10;
        }
        if(unit>500)
        {
            bill=bill+(0.10*bill);
        }
        System.out.println("total bill : Rs. "+bill);
    }    
}
