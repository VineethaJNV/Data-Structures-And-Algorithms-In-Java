public class CheckIfArrayIsSorted {
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }

        boolean ans = (arr[i] < arr[i+1]) && isSorted(arr,i+1);
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6};
        int arr[] = {5};
        System.out.println(isSorted(arr, 0));
    }
}
