
public class InvertedAndRotatedHalfPyramid {

    public static void printPattern(int n){
        for(int i =1 ; i <= n ; i++){
            for(int j = 1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted half pyramid with numers
    public static void inveredHalfPyramidWithNumbers(int n){
        for(int i =1 ; i <= n ; i++){
            for(int j = 1 ; j<= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // fLYOD'S TRIANGLE
    public static void floydTriangle(int n){
        int number = 1;
        for(int i =1 ; i <= n ; i++){
            for(int j = 1 ; j<= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        printPattern(4);
        inveredHalfPyramidWithNumbers(4);
        floydTriangle(4);
    }
}