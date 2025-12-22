//Write a java Program to Convert Minutes to Seconds
import java.util.Scanner;
public class mintosec
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter minutes : ");
        int min=sc.nextInt();
        //conveting to seconds
        int sec=min*60;
        //output
        System.out.printf("Minutes : %d\nSeconds : %ds",min,sec);
    }
}