public class SelectionSort {//Find the 1st minimum element in the 1st iteration and bring in to the start
    //only one swapping for each iteration
    public static void selectionSort(int arr[]){
        
        for(int i = 0 ; i < arr.length; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {3,2,7,5,4,9,8};
        selectionSort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
