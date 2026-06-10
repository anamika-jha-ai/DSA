public class CharacterPattern{
    public static void main (String [] args){
        for(int line = 1 ; line<=20; line++){
            for (char ch = 'A' ; ch < 'A'+line ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}