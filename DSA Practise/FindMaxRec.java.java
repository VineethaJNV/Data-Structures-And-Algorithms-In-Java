public static int findMax(int arr[], int max, int i){
        if(i == arr.length){
            return max;
        }
        max = Math.max(max, arr[i]);
        return findMax(arr, max, i+1);
    }