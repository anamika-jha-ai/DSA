
public class operationOnBits{

    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        int bitMask=~(1<<i);
        n=n & bitMask;
        return n | (newBit<<i);
    }
    public static int clearLastIBits(int n, int i){
        int bitMask=~0<<i;
        return n & bitMask;
    }
    public static int clearBitsInRange(int n, int i, int j){
        int a=~0<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }

    public static void main(String args[]){
        int n=15;
        int i=2;
        int j=4;
        System.out.println("Original number: " + n);
        System.out.println("Get " + i + "th bit: " + getIthBit(n, i));
        System.out.println("Set " + i + "th bit: " + setIthBit(n, i));
        System.out.println("Clear " + i + "th bit: " + clearIthBit(n, i));
        System.out.println("Update " + i + "th bit to 1: " + updateIthBit(n, i, 1));
        System.out.println("Clear last " + i + " bits: " + clearLastIBits(n, i));
        System.out.println("Clear bits in range [" + i + ", " + j + "]: " + clearBitsInRange(n, i, j));
    }
}