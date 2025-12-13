//to print your date of birth in the format DD/MM/YYYY.
import java.util.Scanner;
public class dob 
{
    public static void main(String args[])
    {
        //input
        Scanner s=new Scanner(System.in);
        System.out.print("Enter date, month and year of birth :");
        int day=s.nextInt();
        int month=s.nextInt();
        int year=s.nextInt();
        //output
        System.out.printf("Your date of birth : %02d/%02d/%4d",day,month,year);
    }
}
