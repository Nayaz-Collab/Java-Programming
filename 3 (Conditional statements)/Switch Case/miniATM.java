//Write a Java Program using switch case to implement a mini ATM simulation.

import java.util.Scanner;

public class miniATM 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Action no.\n1.Withdraw.\n2.Deposit.\n3.Check Balance.\n4.Exit");
        int choice=sc.nextInt();
        //condition check
        double balance=1500.00;
        switch(choice)
        {
            case 1:
                System.out.println("Balance : "+balance);
                System.out.print("Enter amount to withdraw : ");
                double withdrawing=sc.nextDouble();
                System.out.println("Amount withdrawn : "+withdrawing);
                if(withdrawing>balance)
                {
                    System.out.println("Insufficient Balance...");
                }
                else
                {
                    balance-=withdrawing;
                    System.out.println("Amount withdrawn");
                    System.out.println("Balance : "+balance);
                }
                break;
            case 2:
                System.out.println("Balance : "+balance);
                System.out.print("Enter amount to deposit : ");
                double depositing=sc.nextDouble();
                System.out.println("Amount deposit successful...");
                balance+=depositing;
                System.out.println("Balance : "+balance);
                break;
            case 3:
                System.out.println("Your balance : "+balance);
                break;
            case 4:
                System.out.println("Thankyou! visit again...");
                break;
            default:
                System.out.println("Invalid action...");
        }
    }    
}
