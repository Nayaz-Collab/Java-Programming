//Write a java program to check if 
//withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

import java.util.Scanner;

public class ATMWithdrawalValidation 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Withdrawal amount : ");
        double amount=sc.nextDouble();
        //condition check
        double balance=50000.0;//assume balance as 50k
        if(amount<=balance && amount%100==0)
        {
            System.out.println("Amount withdrawal successful");
        }
        else
        {
            System.out.println("Invalid request...");
        }
    }    
}
