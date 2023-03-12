import java.util.Arrays;
public class BinarySearch {
    //prerequisite => sorted array
    public static int binarySearch(int arr[], int key){
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(key < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 4;
        System.out.println("Element is found at:"+binarySearch(arr, key) );
    }
}
