
public class Assignment{

    //Q1.Array of size N , find all occurrences of a number x in the array and print them using recursive function.
    public static int findAllAoccurrences(int arr[] , int key , int i){
        if(i== arr.length){
            return 0;
        }
        if(arr[i]==key){
            System.out.print(i + " ");
        }
        return findAllAoccurrences(arr, key, i+1);
    }

    //Q2. You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
    public static String convertToString(int n){
        if(n==0){
            return "";
        }
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int lastDigit = n%10;
        return convertToString(n/10) + arr[lastDigit] + " ";
    }


    public static void main(String args[]){
            // int arr[] = {3,2,4,5,6,2,7,2,2};
            // int key = 2;
            // findAllAoccurrences(arr, key, 0);
            // System.out.println();
            int n = 2819;
            System.out.println(convertToString(n));
    }
}