public class QSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int i = si - 1;
        int pivot = arr[ei];

        for(int j = si; j < ei; j++){
            if(arr[j] < pivot){
                //i has to make place for smaller elements
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot in its correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
