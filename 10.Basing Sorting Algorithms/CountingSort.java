public class CountingSort {
    public static void printArr(int arr[]){
        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int countArr[] = new int[largest+1];
        for(int i = 0 ; i < arr.length; i++){
            countArr[arr[i]]++;
        }
        printArr(countArr);
        int k = 0;
        for(int i = 0 ; i <countArr.length; i++){
            if(countArr[i] != 0){
                for(int j = 0; j < countArr[i]; j++){
                    //System.out.print(i +" ");
                    arr[k] = i;
                    k++;
                }
            }
        }
        
    }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
       
    }
}
