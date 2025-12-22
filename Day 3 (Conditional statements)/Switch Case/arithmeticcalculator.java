//Write a Java Program for an arithmetic calculator using switch case.

import java.util.Scanner;

public class arithmeticcalculator 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.print("Enter arithmetic operation(+ - * / % ) : ");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.printf("Addition : %.2f",(n1+n2));
                break;
            case '-':
                System.out.printf("Subtraction : %.2f",(n1-n2));
                break;
            case '*':
                System.out.printf("Multiplication : %.2f",(n1*n2));
                break;
            case '/':
                System.out.printf("division : %.2f",(n1/n2));
                break;
            case '%':
                System.out.printf("Modulo divison : %.2f",(n1%n2));
                break;
            default:
                System.out.println("Invalid operation...");
        }
    }    
}
