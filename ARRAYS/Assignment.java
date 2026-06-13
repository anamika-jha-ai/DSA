
public class Assignment {

    //IF THERE IS ANY DUPELICATE ELEMENT RETURN TRUE ELSE FALSE
    public static boolean containDuplicate(int nums[]){
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j <nums.length ; j++){
                return true ;
            }
        }
        return false;
    }


    public static void main(String args[]){
        int nums [] = {2,3,5,6,2};
        System.out.println(containDuplicate(nums));

    }
}