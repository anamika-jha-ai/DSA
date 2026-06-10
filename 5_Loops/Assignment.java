import java.util.*;
public class Assignment {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        // Reads a set of int and then prints tshe sum of the even and off int
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter the number of integers you want to input: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " integers: ");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num%2==0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        // Factorial of a number 
        System.out.println("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);


        // Write a program to print the multiplication table of a number N , entered by the user 
        System.out.println("Enter a number to print its multiplication table: ");
        int n1 = sc.nextInt();
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(n1 + " X " + i + " =" + n1*i);
        }
    }
}