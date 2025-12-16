//Java Program to convert Fahrenheit to Celsius.
import java.util.Scanner;
public class ftoc 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter temperature in Fahrenheit : ");
        Scanner sc=new Scanner(System.in);
        double fah=sc.nextDouble();
        //compute celcius degree
        double cel=(fah-32.0)*(5.0/9.0);
        //out
        System.out.printf("Fahrenheit : %f - Celsius : %f",fah,cel);
    } 
}