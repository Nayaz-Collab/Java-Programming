//print your address in multiple lines using \n.
import java.util.Scanner;
public class address 
{
    public static void main(String args[])
    {
        //input address
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Door no. and Street : ");
        String add1=sc.nextLine();
        System.out.print("Enter city and State : ");
        String add2=sc.nextLine();
        System.out.print("Enter pincode : ");
        String add3=sc.nextLine();
        //output
        System.out.println("\nYour Address : ");
        System.out.printf("%s\n%s\n%s",add1,add2,add3);
    }
}
