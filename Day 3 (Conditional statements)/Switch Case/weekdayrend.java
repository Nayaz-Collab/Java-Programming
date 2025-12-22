//check whether the given day number (1–7) is a weekday or weekend.

import java.util.Scanner;

public class weekdayrend 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Give day number(if week starts from sunday) : ");
        int day=sc.nextInt();
        //switch case check
        switch(day)
        {
            case 1,2,3,4,5:
                System.out.println("Weekday");
                break;
            case 6,7:
                System.out.println("Weekend");
        }
    }    
}
