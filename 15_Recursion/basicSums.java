
public class basicSums{


    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }

    //calculating sum 
    public static int calcSum(int n){
        if(n==0){
            return 0;
        }
        return n + calcSum(n-1);
    }

    //fibonacci series
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
       
        return fib(n-1) + fib(n-2);
    }
    public static void main (String args[]){
        System.out.println(fact(5));
        System.out.println(calcSum(5));
        System.out.println(fib(5));
    }
}