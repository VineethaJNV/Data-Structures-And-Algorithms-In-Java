public class QuickSort {
    public static void printArr(int arr[]){
        for(int i = 0 ; i  < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivotIdx = partition(arr, si, ei);
        quickSort(arr, si, pivotIdx-1);  // left
        quickSort(arr, pivotIdx+1, ei);  // right
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for elements smaller than pivot

        for(int j = si; j< arr.length; j++){
            if(arr[j] < pivot){ // need to  make space
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //putting pivot in it's place
        i++;
         //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp; // dont writ pivot = temp => pivot is valu not idx
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8, -5};
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
