
public class checkOddEven{
    public boolean OddOrEven(int n){
        if ((n & 1) == 0) {
    return true;
} else {
    return false;
}
    }

    public static void main(String args[]){
        int n=5;
        checkOddEven obj=new checkOddEven();
        System.out.println(obj.OddOrEven(n));
    }
}