import java.util.*;
public class doWhileLoop{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        //PRINT EVERY NUMBER EXCEPT MULTIPLE OF 10
        // do{
        //     System.out.println("Enter some number: ");
        //     int n = sc.nextInt();

        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println("You entered: " + n);
        // }while(true);

        // CHECKING WHETHER THE NUMBER IS PRIME OR NOT
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for( int i = 2; i <= num -1 ; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }
    }
}