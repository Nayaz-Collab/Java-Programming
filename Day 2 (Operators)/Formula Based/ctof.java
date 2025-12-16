//Write a Java Program to convert Celsius to Fahrenheit.
import java.util.Scanner;
public class ctof 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter temperature in Celsius : ");
        Scanner sc=new Scanner(System.in);
        double cel=sc.nextDouble();
        //compute celcius degree
        double fah=(cel*(9.0/5.0))+32.0;
        //output
        System.out.printf("Celsius : %f - Fahrenheit : %f",cel,fah);
    } 
}