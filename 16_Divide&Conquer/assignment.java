class  assignment{

    //APPLY MERGE SORT TO AN ARRAY OF STRINGS
    public static String[] mergeSort(String arr[], int lo , int hi){
        if(lo == hi){
            String base[] = new String[1];
            base[0] = arr[lo];
            return base;
        }
        int mid = (lo+hi)/2;
        String left[] = mergeSort(arr, lo, mid);
        String right[] = mergeSort(arr, mid+1, hi);
        return merge(left, right);
    }
    public static String[] merge(String left[], String right[]){
        String ans[] = new String[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i].compareTo(right[j]) < 0){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }

    //MAJORITY ELEMENT IN AN ARRAY(BRUTE FORCE)
    public static int majorityElement(int arr[]){
        int count = 1;
        int element = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] == element){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                element = arr[i];
                count = 1;
            }
        }
        // Verify if the element is actually the majority element
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                count++;
            }
        }
        if(count > arr.length/2){
            return element;
        }else{
            return -1; // No majority element
        }
    }

    //MAJORITY ELEMENT IN AN ARRAY(DIVIDE AND CONQUER)
    public static int majorityElementDC(int arr[], int lo, int hi){
        if(lo == hi){
            return arr[lo];
        }
        int mid = (lo + hi) / 2;
        int leftMajority = majorityElementDC(arr, lo, mid);
        int rightMajority = majorityElementDC(arr, mid + 1, hi);

        if(leftMajority == rightMajority){
            return leftMajority;
        }

        int leftCount = countInRange(arr, leftMajority, lo, hi);
        int rightCount = countInRange(arr, rightMajority, lo, hi);

        if(leftCount > (hi - lo + 1) / 2){
            return leftMajority;
        } else if(rightCount > (hi - lo + 1) / 2){
            return rightMajority;
        } else {
            return -1; // No majority element
        }
    }
    public static void main(String args[]){
        String arr[] = {"banana", "apple", "grape", "kiwi", "orange"};
        String sortedArr[] = mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
        int majority = majorityElement(new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4});
        System.out.println("Majority element: " + majority);
    }
}