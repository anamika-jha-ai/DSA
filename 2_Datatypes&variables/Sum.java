import java.util.*;

public class Sum {
    public static void main (String args []){
        // int a = 10 ; 
        // int b = 5; 
        // int sum = a + b;
        // System.out.println("The sum of a and b is: " + sum);

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
    }
}