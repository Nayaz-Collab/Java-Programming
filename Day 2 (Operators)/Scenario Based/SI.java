//java Program to Calculate Simple Interest
import java.util.Scanner;
public class SI 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        double principal=sc.nextDouble();
        System.out.print("Enter rate of interest : ");
        double rate=sc.nextDouble();
        System.out.print("Time period : ");
        double time=sc.nextDouble();
        //computing
        double simple_interest=(principal*rate*time)/100;
        //output
        System.out.print("Simple Interest : "+simple_interest);
    }
}
