

//MAX SUBARRAY USING PREFIX ARRAY
public class Arrays8{

    public static void maxSubarray(int nums[]){
        int currSum = 0 ; 
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        //calculating prefix array
        for(int i = 1 ; i <nums.length ; i++){
            prefix[i] = nums[i-1] + nums [ i];
        
        }
        for(int i = 0 ; i <nums.length ; i++){
            int start = i;
            for(int j = i ; j <nums.length ; j++){
                int end = j;
                currSum = prefix[end] + prefix[start];

                if(currSum> maxSum){
                    maxSum = currSum;
                }
            }
           
        }
         System.out.println("maximum sum = " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {2,3,6,7,8,4};
        maxSubarray(nums);
    }
}