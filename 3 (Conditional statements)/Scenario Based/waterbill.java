//Q18.Write a java program to calculate water bill 
// using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).

import java.util.Scanner;

public class waterbill 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total litres : ");
        double ltr=sc.nextDouble();
        double bill=0.0;
        //condition check
        if(ltr<=1000)
        {
            bill=0;
        }
        else if(ltr>1000 && ltr<=3000)
        {
            bill=((ltr-1000)/1000)*5;
        }
        else
        {
            bill=((2000/1000)*5)+((ltr-3000)/1000)*10;
        }
        //output
        System.out.printf("Water bill : %.2f\n",bill);
        System.out.printf("Remaining : %.2f",ltr);
    }
}
