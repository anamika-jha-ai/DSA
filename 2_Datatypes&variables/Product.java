import java.util.*;
public class Product{
    public static void main (String args[]){
        // int a = 3 ; 
        // int b = 4 ; 
        // int product = a*b;
        // System.out.println(product);

        // Area of circle 
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double area = 3.14 * rad * rad;
        System.out.println("Area  of the circle :"+ area);
    }
}