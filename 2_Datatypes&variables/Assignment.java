import java.util.*;
public class Assignment {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        //q1 3 inputs A B C . find averge 
        // System.out.println("Enter number 1:");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2:");
        // int b = sc.nextInt();
        // System.out.println("Enter number 3:");
        // int c = sc.nextInt();
        // int average = (a+b+c)/3;
        // System.out.println("The average of " + a + ", " + b + ", and " + c + " is: " + average);

        // Q2 Area of a square
        // System.out.println("Enter the side of the square :");
        // int side = sc.nextInt();
        // int area = side*side; 
        // System.out.println("Area of the square is :" + area);

        //Q3.cost of any 3 item calculate total bill including 18% gst. 
        System.out.println("Enter the price of item 1 : ");
        double item1 = sc.nextDouble();
        System.out.println("Enter the price of item 2 : ");
        double item2 = sc.nextDouble();
        System.out.println("Enter the price of item 3:");
        double item3 = sc.nextDouble();
        double total = item1+item2+item3;
        double gst = total*0.18;
        double finalBill = total + gst;
        System.out.println("The final bill including GST is: " + finalBill);

        //check is it gives error
        int $ = 24; 
        System.out.println($);


    }
}