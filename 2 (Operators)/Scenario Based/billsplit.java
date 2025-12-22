//Write a java Program to Split the Bill Among 3 Friends
import java.util.Scanner;
public class billsplit
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bill amount : ");
        int bill=sc.nextInt();
        //divide among three friends
        int split=bill/3;
        int balance=bill%3;
        //output
        System.out.printf("Each friend gets a share of %d,\nwith remaining amount of %d",split,balance);
    }
}
