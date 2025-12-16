//java Program to Distribute Candies Equally Among People
import java.util.Scanner;
public class distcandy 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter candies : ");
        int candies=sc.nextInt();
        System.out.print("Enter No. of people : ");
        int people=sc.nextInt();
        //computing
        int split=candies/people;
        int remaining_candies=candies%people;
        //output
        System.out.printf("\"%d\" can be distributed among %d people equally.\nwhile \"%d\" (remaining) cannot be split.",split,people,remaining_candies);

    }
}
