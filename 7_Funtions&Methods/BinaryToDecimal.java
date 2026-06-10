public class BinaryToDecimal{

    public static int binaryToDecimal(int binary){
        int pow = 0;
        int decimal = 0 ; 
        while(binary>0){
        int lastDigit = binary%10;
        decimal = ( decimal + ( lastDigit* (int)Math.pow(2, pow)));
        pow++;
        binary = binary/10;
        }
        return decimal;
    }

    public static void decimalToBinary(int decimal){
        int myNum = decimal;
        int pow = 0 ;
        int binNum = 0 ; 

        while(myNum>0){
            int rem = myNum%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            myNum = myNum/2;
        }
        System.out.println(binNum);
    }
    public static void main (String args[]){
        System.out.println(binaryToDecimal(1011100001));
        decimalToBinary(7);
    }
}