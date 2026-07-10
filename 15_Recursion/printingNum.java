public class printingNum{
    
    public static void printDec(int nums){
        if(nums ==1){
            System.out.print(nums);
            return;
        }
        System.out.print(nums + " ");
        printDec(nums-1);
    }

    public static void printInc(int nums){
        if(nums ==1){
            System.out.print(nums);
            return;
        }
        printInc(nums-1);
        System.out.print(" " + nums);
    }


    public static void main(String args[]){
        printDec(5);
        System.out.println(); // For a new line
        printInc(5);
    }
}