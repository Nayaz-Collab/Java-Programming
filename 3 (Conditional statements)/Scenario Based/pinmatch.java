//Q8.Write a java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.

import java.util.Scanner;

public class pinmatch 
{
    static final int PIN=3214;
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter PIN : ");
        int pin=sc.nextInt();
        //condition check
        if(pin==PIN)
        {
            System.out.println("Access granted!\nYou can withdraw now.");
        }
        else
        {
            System.out.println("Wrong PIN!\nAccess denied...");
        }
    }    
}
