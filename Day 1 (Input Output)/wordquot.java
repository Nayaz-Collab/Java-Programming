//Java Program to print two words in double quotes.
import java.util.Scanner;
public class wordquot 
{
    public static void main(String[] args)
    {
        //input
        System.out.print("Enter two words : ");
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
        //output in double quotes
        System.out.printf("Word in double quotes : \"%s\" \"%s\"",word1,word2);
    }
}
