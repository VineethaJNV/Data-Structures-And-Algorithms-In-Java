public class SearchInRotatedSortedArray {
    public static int searchInTotatedSorted(int arr[],int target,  int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;


        if(arr[mid] == target){
            return mid;
        }
        //line 1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= target && target <arr[mid]){
                return searchInTotatedSorted(arr, target, si, mid-1);
            }else{
                return searchInTotatedSorted(arr, target, mid+1, ei);
            }
            
        }else{
            if(arr[mid+1] <= target && target <= arr[ei]){
                return searchInTotatedSorted(arr, target, mid+1, ei);
            }else{
                return searchInTotatedSorted(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // o/p => 4
        System.out.println(searchInTotatedSorted(arr, target, 0, arr.length -1));


    }
}
