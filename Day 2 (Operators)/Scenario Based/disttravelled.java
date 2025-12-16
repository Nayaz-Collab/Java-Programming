//Write a java Program to Calculate the Distance Travelled
import java.util.Scanner;
public class disttravelled 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the speed of travelling(in km/hr) : ");
        int speed=sc.nextInt();
        System.out.print("Enter the time taken to reach the destination(in sec) : ");
        int time=sc.nextInt();
        //distance travelled
        int distance=speed*time;
        //output
        System.out.printf("Distance travelled : %d mts",distance);
    }
}
