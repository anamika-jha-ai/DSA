
import java.util.Scanner;
public class Assignment {

    //FIND THE AVERAGE OF 3 NUMBERS USING A FUNCTION
    public static void average(int a , int b , int c){
        int avg = (a+b+c)/3;
        System.out.println("The average is: " + avg);
    }

    //METHOD TO CHECK ISEVEN OR ODD ALSO A PROGRAM TO TEST YOUR METHOD
    public static boolean isEven(int num){
        if(num%2 == 0){
            System.out.println(num + " is even.");
            return true;
        } else {
            System.out.println(num + " is odd.");
            return false;
        }
    }

    //Method to check if a number is a palindrome or not
    public static boolean ispalindrome(int number){
        int palindrome = number;
        int reverse = 0 ; 
        while(palindrome != 0 ){
            int digit = palindrome % 10; 
            reverse = reverse *10 + digit;
            palindrome = palindrome / 10;
        }
        if(reverse == palindrome){
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }

    // Method to compute the sum of the digits in an integer
    public static int sumOfDigits(int number){
        int sum = 0 ; 
        while(number !=0){
            int digit = number %10;
            sum += digit;
            number = number/10;
        }
        return sum;
    }


    public static void main(String [] args){
        average(10,20,30);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd: ");
        int num = sc.nextInt();
        isEven(num);

        System.out.println("Enter a number to check if it is a palindrome: ");
        int num2 = sc.nextInt();

        ispalindrome(num2);

        System.out.println("Enter a number to compute the sum of its digits: ");
        int num3 = sc.nextInt();    
        int sum = sumOfDigits(num3);
        System.out.println("The sum of the digits in " + num3 + " is: " + sum);

    }
}