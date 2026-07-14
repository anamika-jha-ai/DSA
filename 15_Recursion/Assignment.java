
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

    //Q3. wap to find length of a string using recursion.
    public static int lengthOfString(String str){
        if(str.equals("")){
            return 0;
        }
        return 1 + lengthOfString(str.substring(1));
    }

    //Q4. cout of all contigious substrings starting and ending with same character.
    public static int countContiguousSubstrings(String str){
        if(str.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }

    //Q5.tower of hanoi
    public static void towerOfHanoi(int n, char source, char destination, char helper){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, destination, source);
    }


    public static void main(String args[]){
            // int arr[] = {3,2,4,5,6,2,7,2,2};
            // int key = 2;
            // findAllAoccurrences(arr, key, 0);
            // System.out.println();
            // int n = 2819;
            // System.out.println(convertToString(n));
            // System.out.println(lengthOfString("Hello"));
            // System.out.println(countContiguousSubstrings("abcba"));
            towerOfHanoi(3, 'A', 'B', 'C');
    }
}