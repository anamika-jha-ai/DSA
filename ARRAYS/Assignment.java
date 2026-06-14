
public class Assignment {

    //IF THERE IS ANY DUPELICATE ELEMENT RETURN TRUE ELSE FALSE
    public static boolean containDuplicate(int nums[]){
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j <nums.length ; j++){
                return true ;
            }
        }
        return false;
    }

    //sort in an array if it is rotated.
    // [0124567] => [4567012]
    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    //STOCK BUY AND SELL
    public static int buyAndSell(int prices[]){

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0 ; i < prices.length ; i++){

        if(buyPrice < prices[i]){

            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);

        } else {

            buyPrice = prices[i];
        }
    }

    return maxProfit;
}

    //Trapped rainwater 
    public static int trappedRainWater(int height[]){
        int n = height.length;
        int trappedWater = 0 ;
        //calculate leftmax boundary-array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i <n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        //calculate rightmax 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2 ; i >=0 ;i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        //loop
        for(int i = 0 ; i <n ; i++){
            int waterlvl = Math.min(leftMax[i] , rightMax[i]);
            trappedWater += waterlvl -  height[i];
        }
        return trappedWater;
    }

    //3SUM
    public static void threesum(int array[]){
        for(int i = 0 ; i < array.length-2; i++){
            for(int j = i+1 ; j<array.length-1; j++){
                for(int k = j+1 ; k<array.length ; k++){
                    if(array[i]+array[j]+array[k] == 0){
                        System.out.println("[" + array[i] + "," + array[j] + "," + array[k] + "]");
                    }
                }
            }
        }
        // return -1;
    }
    
  

    public static void main(String args[]){
        // int nums [] = {2,3,5,6,2};
        int nums [] = {4,5,6,7,0,1,2};
        int prices[] ={7, 6, 4,  3, 1};
        int height[] ={4,2,0,3,2,5};
        int array [] = {-1 , 0 , 1, 2 , -1 , -4};


        System.out.println(containDuplicate(nums));
        System.out.println(search(nums, 3));
        System.out.println(buyAndSell(prices));
        System.out.println(trappedRainWater(height));
        threesum(array);
    }
}