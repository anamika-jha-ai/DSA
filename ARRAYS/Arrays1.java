// package ARRAYS;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // int phy
        // phy = sc.nextInt();
        System.out.println("Enter phy, chem and math marks: ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy marks: " + marks[0]);
        System.out.println("chem marks: " + marks[1]);
        System.out.println("math marks: " + marks[2]);

    }

}
