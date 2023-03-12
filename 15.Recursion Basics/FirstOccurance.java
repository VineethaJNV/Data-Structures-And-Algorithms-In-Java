public class FirstOccurance {
    //Write a function to find the first occurance of an element in an array
    public static int findFirstOccur(int arr[] , int idx, int key){
        if(idx == arr.length-1){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }
        return findFirstOccur(arr , idx+1, key);
        
        
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,8,1,2,3,5,67,5};
        System.out.println(findFirstOccur(arr, 0, 5));
    }
}
