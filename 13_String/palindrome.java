

public class palindrome{
    public static boolean isPalindrome(String str){
        for(int i = 0 ; i <str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){//u can use i =1 but make sure the left side of i include i-1 bcz we starts checking from index 0
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){
        String str ="racecar";
        String str2 ="raceceear";

      System.out.println(  isPalindrome(str2));
    }
}