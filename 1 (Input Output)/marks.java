//print your marks in 5 subjects each on a new line.
import java.util.Scanner;
public class marks 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter 5 subject marks : ");
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        //output
        System.out.printf("Mark 1: %d\nMark 2: %d\nMark 3: %d\nMark 4: %d\nMark 5: %d",m1,m2,m3,m4,m5);
    }
}
