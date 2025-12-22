//Write a java program to display mobile data usage 
// alert – "Low Data", "Half Consumed", or "Data Over" based on usage.

import java.util.Scanner;

public class mobiledatausage 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total data MB : ");
        double totdata=sc.nextDouble();
        System.out.print("Enter data usage MB : ");
        double datause=sc.nextDouble();
        double percent_50=totdata*0.50;
        double percent_80=totdata*0.80;
        //condition check
        if(datause<=percent_50)
        {
            System.out.print("Data more than half...");
        }
        else if(datause>percent_50 && datause<percent_80)
        {
            System.out.print("Half Consumed...");
        }
        else if(datause>=percent_80 && datause<datause)
        {
            System.out.print("Low Data...");
        }
        else
        {
            System.out.print("Data Over...");
        }
        
    }    
}
