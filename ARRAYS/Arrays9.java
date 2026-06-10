//MAX SUM SUBARRAY USING KADANES'S ALGO

public class Arrays9{
    
    public static int maxSubarray(int nums[])
    {
        int currSum = 0 ; 
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length;i++){
          
                currSum += nums[i];

                maxSum = Math.max(maxSum , currSum);

                if(currSum<0){
                    currSum=0;
                }
            
        
            }
               System.out.println("max sum of subaray is :" +maxSum);

            return maxSum;  
    }

    public static void main (String args[]){
        int nums[] = {3,4,5,6,7,5};
        maxSubarray(nums);
    }
}