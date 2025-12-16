//Calculate Total Cakes Made based on no.of trays and no.of cakes for each tray
import java.util.Scanner;
public class cakestray 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of trays : ");
        int trays=sc.nextInt();
        System.out.print("Enter no. cakes per tray : ");
        int cake_per_tray=sc.nextInt();
        //compute
        int total_cakes=trays*cake_per_tray;
        //output
        System.out.println("Total cakes made : "+total_cakes);
    }
}
