import java.util.*;
public class IfElse{
    public static void main ( String args[]){
       
       //Largest of two numbers
        67int a = 156; 
        int b = 76 ; 
        if (a>b){
            System.out.println("a is greater than b ");
        }else{
            System.out.println("b is greater than a");
        }

        // if number is odd or even 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's odd or even : ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

        
    }
}