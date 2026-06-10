import java.util.*;
public class functions{

    public static void calculateSum(int a, int b){// Parameters or formal parameters
        int sum = a+b;
        System.out.println("Sum: " + sum);
        return;
    }

    //FUNTION OVERLOAD(OOPS)
    public static int sum (int c, int d){
        return c+d;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main (String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        calculateSum(a, b); // Arguments or actual parameters

        int result1 = sum(5, 10);
        int result2 = sum(5, 10, 15);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}