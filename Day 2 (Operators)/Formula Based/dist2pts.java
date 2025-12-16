//Java Program to find the distance between two points.
import java.util.Scanner;
public class dist2pts 
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x1 and y1 values of one point : ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.print("Enter the x2 and y2 values of another point : ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        //computing distance
        //sqrt([x2-x1]^2+[y2-y1]^2)
        int xdiff=x2-x1;
        int ydiff=y2-y1;
        int xdiffsq=xdiff*xdiff;
        int ydiffsq=ydiff*ydiff;
        int sumsquared=xdiffsq+ydiffsq;
        double result=Math.sqrt(sumsquared);
        //result
        System.out.printf("Distance between the two points : %.4f",result);
    }
}
