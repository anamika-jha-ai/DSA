 class mergeSort{

    public static void mergeSort(int arr[], int si , int ei){
        if(si>=ei){
            return;
        }

        //kaam
        int mid = (si+ei)/2;
        mergeSort(arr, si, mid);//left part sort
        mergeSort(arr, mid+1, ei);//right part sort
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from either left or right subarray
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k] = arr[j];
            j++;
            k++;
        }
        // Copy the merged elements back to the original array
        for(int p=0; p<temp.length; p++){
            arr[si+p] = temp[p];
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 2, 8, 1, 9};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
 }