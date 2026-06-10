public class BinomialCoeff{
    public static long factorial(int n ){
        long fact = 1 ; 
        for(int i = 1 ; i<=n ; i++){
            fact = fact*i;
        }
        return fact ;
    }
    public static void main(String[] args){
        int n =15; int r = 2;
        long nFact = factorial(n);
        long rFact = factorial(r);
        long nmrFact = factorial(n-r);
        long binomialCoeff = nFact/(rFact* nmrFact);
        System.out.println("Binomial Coefficient ="+ binomialCoeff);

    }
}