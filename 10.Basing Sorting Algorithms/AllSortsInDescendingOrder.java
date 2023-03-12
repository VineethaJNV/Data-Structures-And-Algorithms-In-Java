public class AllSortsInDescendingOrder {
    /*Use the following sorting algorithms tosort an array in DESCENDING order :
    a.Bubble Sort b.Selection Sort c.Insertion Sort d.Counting Sort
     */
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void bubbleSortDescending(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            int swaps = 0;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                return;
            }
        }
    }
    public static void SelectionSortDescending(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int largestPos = i;
            for(int j = i +1; j <arr.length; j++){
                if(arr[j] > arr[largestPos]){
                    largestPos = j;
                }
            }
            int temp = arr[largestPos];
            arr[largestPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSortDescending(int arr[]){
        for(int i  = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void countingSortDescending(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;  i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int countArr[] = new int[max+1];
        for(int i = 0;  i< arr.length; i++){
            countArr[arr[i]]++;
        }
        int k = 0;
        for(int i = countArr.length-1; i >= 0; i--){
            if(countArr[i] != 0){
                for(int j = 0; j < countArr[i]; j++){
                    arr[k] = i;
                    k++;
                }
            }
        }
    }
     public static void main(String[] args){
        int arr[]=  {3,6,2,1,8,7,4,5,3,1};
        //bubbleSortDescending(arr);
        //SelectionSortDescending(arr);
        //insertionSortDescending(arr);
        countingSortDescending(arr);
        printArr(arr);
    }
    
}
