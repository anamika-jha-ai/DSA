import java.util.*;

public class Binary_search{
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
    int numbers[] = {3,4,5,6,7,8,9,11,12,34,56,78};
    int key = 12;
    int index = binarySearch(numbers, key);
    System.out.println("Index of " + key + " is: " + index);
}
}

