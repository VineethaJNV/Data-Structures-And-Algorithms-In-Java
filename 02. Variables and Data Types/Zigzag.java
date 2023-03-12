public class Zigzag {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};

        int mid = arr.length /2;
        int temp = arr[mid];
        arr[mid] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        int st = mid+1;
        int end = arr.length -2;
        while(st < end){
            temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +" ");
        }
    }
}
