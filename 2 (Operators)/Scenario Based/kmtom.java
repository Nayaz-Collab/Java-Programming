//java Program to Convert Kilometers to Meters
import java.util.Scanner;
public class kmtom 
{
    public static void main(String[] args)
    {
        //imput
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Kilometers : ");
        double km=sc.nextDouble();
        //converting
        double mts=km*1000;
        //output
        System.out.printf("Kilometers : %.2f\nMeters : %.0f meters.",km,mts);

    }    
}
