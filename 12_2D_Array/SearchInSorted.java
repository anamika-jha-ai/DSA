
public class SearchInSorted{

    public static boolean search(int matrix [][] , int key){
        int row = 0 , col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found the key at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {18,28,38,48},
                        {19,29,39,50}};
       System.out.println( search(matrix ,39));
    }
}