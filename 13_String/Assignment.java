
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
        System.out.print("count of vowels is :" + count);
    }
}