public class AdvancePatterns{
    public static void main (String [] args){

        //INVERTED HALF PYRAMID
         for (int line = 4; line >=1; line --){
            for (int number = 1 ; number <=line ; number++){
                System.out.print(number);
            }
            System.out.println();
         }

         // another tupe of inverted hald pyramid
            for (int line = 4 ; line >=1 ; line--){
                for (int number =line; number >=1; number--){
                    System.out.print(number);
                }
                System.out.println();
            }
    }
}