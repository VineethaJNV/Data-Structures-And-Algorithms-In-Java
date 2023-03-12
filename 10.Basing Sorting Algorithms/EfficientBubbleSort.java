public class EfficientBubbleSort {
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int swaps = 0;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j +1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
                
            }
            System.out.println(swaps);
            if(swaps == 0){
                return;
            }
        }
        return;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int arr1[] = {2,5,1,4,3};
        bubbleSort(arr);
        printArr(arr);

        bubbleSort(arr1);
        printArr(arr1);
    }
}
