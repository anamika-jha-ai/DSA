public class findingPermutation{
    public static void findPermutation(String str,String ans) {
        //basecase
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recusrion
        for(int i = 0 ; i <str.length(); i++){
            char curr = str.charAt(i);
            //absde => ab + de = abde
            String NewStr = str.substring(0,i) + str.substring(i+1);// it will completely skip i bcz substring function exculdes the last given index
            findPermutation(NewStr, ans + curr);
        }
    }
    public static void main(String agrs[]){
        String str = "abc";
        findPermutation(str, "");
    }
}