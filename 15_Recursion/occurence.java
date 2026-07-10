public class occurence{

    public static int firstOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }

    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 2, 4, 2, 5};
        int key = 2;
        System.out.println("First occurrence of " + key + " is at index: " + firstOccurrence(arr, key, 0));
        System.out.println("Last occurrence of " + key + " is at index: " + lastOccurrence(arr, key, 0));
    }
}