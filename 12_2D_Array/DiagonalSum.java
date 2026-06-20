
public class DiagonalSum{
    public static int sum(int matrix [] [] ){
        int sum = 0 ; 
        for(int i = 0 ; i < matrix.length ; i++){//for rows
        for(int j = 0 ; j< matrix[0].length ; j++){
            if(i == j){
                sum += matrix[i][j];
            }else if(i+j == matrix.length-1){
                sum += matrix [i] [j];
            }
        }

        }
        return sum;

    }
    public static void main (String args[]){
        int matrix [][] = {{1,23,45},
                            {67,89,43},
                            {34,7,65}
                           };
System.out.println(sum(matrix));    }
}