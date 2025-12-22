//java Program to Currency Notes from ATM
import java.util.Scanner;
public class currnotesATM
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter withdrawn amount : ");
        int amount=sc.nextInt();
        //compute;
        int no_1000=amount/1000;
        amount%=1000;
        int no_500=amount/500;
        amount%=500;
        int no_100=amount/100;
        amount%=100;
        int no_50=amount/50;
        amount%=50;
        int no_20=amount/20;
        amount%=20;
        int no_10=amount/10;
        amount%=10;
        int no_5=amount/5;
        amount%=5;
        int no_2=amount/2;
        amount%=2;
        int no_1=amount/1;
        amount%=1;
        //output
        System.out.printf("1000s : %d\t\t500s : %d\n100s : %d\t\t50s : %d\n20s : %d\t\t\t10s : %d\n5s : %d\t\t\t2s : %d\n1s : %d\t\t\tamount",no_1000,no_500,no_100,no_50,no_20,no_10,no_5,no_2,no_1,amount);
    }
}
