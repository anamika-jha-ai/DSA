

public class Assignment{

    //COUNT THE FREQUENCY OF ANY NUMBER
    public static int count(int matrix[][] , int target){
        int count = 0 ;
        for(int i = 0 ; i<matrix.length; i++){
            for( int j = 0 ; j <matrix[0].length; j++){
                if(matrix[i][j] == target){
                    count++;
                }else{
                    return -1;
                }
            }
        }
        return count;
    }
    
    //SUM OF ONLY SECOND ROW
    public static int sumOfSecondRow(int matrix[][]){
        int sum = 0; 
        
        for(int j = 0; j <matrix[0].length;j++){
            sum += matrix[1][j];
        }
        return sum;
        // System.out.println("sum is :" + sum);
    }

    //TRANSPOSE OF A MATRIX
    //first printarr
   public static void printarr(int matrix[][]) {
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

public static void transposeArray(int matrix[][]) {

    int row = matrix.length;
    int col = matrix[0].length;

    int transpose[][] = new int[col][row];

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }

    printarr(transpose);
}
    public static void main (String args[]){
        int matrix[][] = {{4,7,8},{8,4,7},{7,8,4},{5,6,9}};
        // System.out.println(count(matrix,9));
        // System.out.println(sumOfSecondRow(matrix));
        transposeArray(matrix);
    }
}