import java.util.Scanner;
// aVERAGE OF 3 NUMEBR
public class Datatypes{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number 1: ");
        int A = sc.nextInt();

         System.out.print("Enter number 2: ");
        int B = sc.nextInt();

         System.out.print("Enter number 3: ");
        int C = sc.nextInt();

        int average = (A+B+C)/3;
        System.out.println("Average: " + average);
    }
}