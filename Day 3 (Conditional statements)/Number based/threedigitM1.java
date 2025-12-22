//Java Program to check whether a number is a 3-digit number or not.

import java.util.Scanner;

public class threedigitM1 
{
    public static void main(String[] args)
    {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int n=num;
        //int counter=0;
        //condition checking
        if(num!=0)
        {
            num/=10;
            //counter++;
            if(num!=0)
            {
                num/=10;
                //counter++;
                if(num!=0)
                {
                    num/=10;
                    //counter++;
                    if(num==0)
                    {
                        System.out.printf("%d is a 3 digit number.",n);
                    }
                    else
                    {
                        System.out.printf("%d is more than three digit number",n);
                    }
                }
                else
                {
                    System.out.printf("%d is not a 3 digit number",n);
                }
            }
            else
            {
                System.out.printf("%d is not a 3 digit number",n);
            }
        }
        else
        {
            System.out.printf("%d is not a 3 digit number",n);
        }
    }
}
