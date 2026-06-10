import java.util.Scanner;
public class forLoop{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        //Printing 4X4 square of asterisks
        for(int i = 1 ; i<= 4; i++){
            System.out.println("****");
        }

        //Priting reverse of anny number 
        int n = 130406;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n / 10 ; 

        }
        System.out.println();

        // Reverse the given number 
        int num = 12345;
        int reverse = 0;
        while(num>0){
            int lastDigit = num%10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10 ; 

        }
        System.out.println("Reversed number: " + reverse);
    }
}