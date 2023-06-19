public class LinearSearch {
    public static int search(int arr[], int key){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,8,10, 11, 15};
        int key = 11;
        System.out.println("The key is found at index: "+search(arr, key));
    }
}
