//LARGEST AND SMALLEST NUMBER IN AN ARRAY

import java.util.Scanner;

import java.util.*;

public class Arrays3{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // INFINTY minus
    

        for(int i = 0; i<numbers.length; i++){
            if(largest <numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]){
          int smallest = Integer.MAX_VALUE; // INFINITY plus
          for(int i = 0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
          }
          return smallest;
    }
    public static void main(String args[]){
    int numbers[] = {5,7,65,8,7,2,3,9,0};
    System.out.println("The largest value is:" + getLargest(numbers));
    System.out.println("The smallest value is:" + getSmallest(numbers));
}

}

