//print your roll number and name in the format: Roll No: 123, Name: John

import java.util.Scanner;

public class rollname 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Roll no. and Name : ");
        int roll_no=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        //otput
        System.out.printf("Roll No: %d, Name: %s",roll_no,name);
    }
}
