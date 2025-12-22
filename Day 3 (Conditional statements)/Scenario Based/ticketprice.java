//Q17.Write a java program to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.Scanner;
public class ticketprice 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day (in numbers) : ");
        int day=sc.nextInt();
        switch(day)
        {
            case 1,7:
                System.out.println("Ticket prices are 400 only...");
                break;
            case 2,3,4,5,6:
                System.out.println("Ticket prices are 1000...");
                break;
            default:
                System.out.println("Invalid day");
        }
    }    
}
