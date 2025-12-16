//Write a java Program to calculate Salary of Employee
import java.util.Scanner;
public class empsalary 
{
    public static void main(String[] args)
    {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        double basic=sc.nextDouble();
        System.out.print("Enter percentage of House Rent Allowance HRA : ");
        double hra=sc.nextDouble();
        System.out.print("Enter Dearness Allowance DA : ");
        double da=sc.nextDouble();
        //compute
        double hra_amt=(hra*basic)/100;
        double da_amt=(da*basic)/100;
        double total_salary=basic+hra_amt+da_amt;
        //output
        System.out.println("The salary of the employee : "+total_salary);
    }    
}
