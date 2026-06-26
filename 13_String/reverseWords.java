
public class reverseWords{

    public static String reverseWord(String s){

        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = words.length-1; i>=0; i--){
            ans.append(words[i]);

            if(i !=0){
                ans.append(" ");
            }
        }
    return ans.toString();  
  }

    public static void main(String args[]){
        String s = " The sky is blue";
        System.out.println(reverseWord(s));
    }
}