impo44rt java.util.*;
public class PassOrFail{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in the subject:");
        int marks = sc.nextInt();
        if(marks >= 40){
            System.out.println("Congratulations! You have passed.");
        }else{
            System.out.println("Sorry! You have failed. Better luck next time.");
        }
    }
}