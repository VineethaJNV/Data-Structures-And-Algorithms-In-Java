public class BubbleSort {
    public static void sort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){
            boolean isSwap = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    //swap
                    isSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            if( !isSwap){
                System.out.println("The array is already sorted, returning");
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,8,1,4};
        // int arr[] = {1,2,3,4,5,6,7};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
