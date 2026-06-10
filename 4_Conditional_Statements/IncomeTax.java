import java.util.*;
public class IncomeTax{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary to calculate the income tax:");
        double salary = sc.nextDouble();
        if(salary <= 500000){
            System.out.println("No income Tax");
        }else if (salary>500000 && salary <= 1000000){
            double tax = 0.2 * (salary - 500000);
            System.out.println("Income Tax: " + tax);
        }else{
            double tax = 0.3*salary;
            System.out.println("Income Tax: " + tax);
        }

    }
}