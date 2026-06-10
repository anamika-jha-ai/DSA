// ARRAYS AS FUNCTION ARGUMENTS;
// package ARRAYS;

public class Arrays2 {
    public static void update(int marks[] , int nonChangeable) {
        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        int nonChangeable = 5;
        update(marks, nonChangeable);

        // for printing the marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}