//check grade of a student based on marks (A, B, C, Fail).

import java.util.Scanner;

public class grade 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks (out of 100) : ");
        int marks=sc.nextInt();
        //condition checking
        int group=(marks>90)?1:(marks>70 && marks<=90)?2:(marks>=60 && marks<=70)?3:(marks>=40 && marks<60)?4:5;
        switch (group) 
        {
            case 1:
                System.out.println("Grade O");
                break;
            case 2:
                System.out.println("Grade A");
                break;
            case 3:
                System.out.println("Grade B");
                break;
            case 4:
                System.out.println("Grade C");
                break;
            case 5:
                System.out.println("Sorry! You have failed...");
                break;
            default:
                System.out.println("Invalid marks");
        }
    }    
}
