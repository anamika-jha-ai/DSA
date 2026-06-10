import java.util.*;
public class Factorial{
    
    public static long Factorial (int n){
        long fact = 1 ; 
        for(int i = 1 ; i<= n ; i++){
            fact = fact * i ;
        }
      return fact ;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long result = Factorial(n);
        System.out.println("Factorial: " + result);
    }
}