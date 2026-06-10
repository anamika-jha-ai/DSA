import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //While loop
        int i = 1;
        while(i<5){
            System.out.println("Hello World");
            i++;
        }

        int counter = 1; 
        while(counter<=10){
            System.out.print(counter + " ");
            counter++;
        }
       
         System.out.println("\nEnter the range: ");
       int range = sc.nextInt();
       int n = 1;
         while(n<=range){
          System.out.println(n + " ");
          n++;
        }

        // SUM OF FIRST N NATURAL NUMBERS
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int j = 1;
        while(j<=num){
            sum += j;
            j++;
        }
        System.out.println("The sum of first " + num + " natural numbers is: " + sum);
    }
}