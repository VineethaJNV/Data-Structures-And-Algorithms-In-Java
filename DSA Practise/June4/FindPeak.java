package June4;

public class FindPeak {
    public static int findPeakElementIdxOptimized(int arr[]){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-1] > arr[n-2]){
            return n-1;
        }
        int si = 1;
        int ei = n-2;
        while (si <=ei) {
            int mid = (si+ei)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static int findPeakElementIdx(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                if(arr[i] > arr[i+1]){
                    return i;
                }
            }else if(i == arr.length -1){
                if(arr[i] > arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        // int arr[] = {1, 2};
        // int arr[] = {1,2,1,3,5,6,4};
        System.out.println("Peak elemnt index is :"+findPeakElementIdxOptimized(arr));

        
    }
}
