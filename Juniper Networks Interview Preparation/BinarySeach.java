import java.util.*;
public class BinarySeach {
    public static boolean search(int arr[], int key){
        int si = 0;
        int ei = arr.length-1;

        Arrays.sort(arr);
        while(si < ei){
            int mid = (si+ei) / 2;
            if(arr[mid] == key){
                return true;
            }else if (arr[mid] > key){
                ei = mid - 1;
            }else{
                si = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,20,50,3,8,5,4,2,9};
        int key = 20;
        System.out.println("the key is found ?: "+search(arr, key));
    }
}
