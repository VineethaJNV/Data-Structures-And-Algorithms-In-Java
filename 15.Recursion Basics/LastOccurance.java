public class LastOccurance {
    //write a function to find the last occurance of an element in an array
    public static int findLastOccur(int arr[], int key, int idx){
        if(idx == arr.length){
           return -1;
        }
        int isFound = findLastOccur(arr, key, idx+1);

        if(isFound != -1){
            return isFound;
        }
        if(arr[idx] == key){
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,7,5,23,12,5,0,6,5};
        System.out.println(findLastOccur(arr, 5, 0));
        
    }
}
