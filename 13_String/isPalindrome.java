
public class isPalindrome{

    public static boolean checkPalindrome(String str){
        StringBuilder clean = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }

        }
        String str2 = clean.toString();

        for(int i =0 ; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str = "RACECAR";
        System.out.println(checkPalindrome(str));
    }
}