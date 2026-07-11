public class friendPairing{

    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //single choice
          //     int fnm1 = friendPairing(n-1);
          //     //pair choice
          //     int fnm2 = friendPairing(n-2);
          //    int pairWays = (n-1) * fnm2;
          //     return fnm1 + pairWays;

        return friendPairing(n-1) + (n-1) * friendPairing(n-2);
    }

    public static void main(String args[]){
        System.out.println(friendPairing(2));
    }
}