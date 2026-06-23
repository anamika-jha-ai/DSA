import java.util.Arrays;
public class Assignment{

    public static void main(String args[]){
        String str = "Anamika Jha";

        //COUNT THE NUMBER OF SMALL VOWELS
        int count = 0 ;
        for(int i = 0 ; i <str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }                

        }
        System.out.println("count of vowels is :" + count);

        //checkinf if the the strings are anagram
       String str1 = "earth";
       String  str2 = "heart";
        //coverting to lowercase to comapre
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //first check if length are same 
        if(str1.length() == str2.length()){

            //COVERTING THE STRING TO CHAR ARRAY
            char[] str1charArray = str1.toCharArray();
             char[] str2charArray =str2.toCharArray();

            //SORTING THE CHAR ARRAY        
             Arrays.sort(str1charArray);
             Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray , str2charArray);
            if(result){
                System.out.println("BOTH STRINGS ARE ANAGRAM");
            }else{
                System.out.println("ARENOT ANAGRAM");
            }

        }else{
            System.out.println(str1 +" "+ "and" +" "+ str2 +" "+ "are not anagrams");
        }
    }
}