//Write a java Program to Convert Bytes to bits
import java.util.Scanner;
public class bytetobit 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bytes : ");
        int byte_data=sc.nextInt();
        //bit conversion
        int bit_data=byte_data*8;
        //output
        System.out.printf("Bytes : %d Bytes\nBits : %d bits",byte_data,bit_data);

    }
}
