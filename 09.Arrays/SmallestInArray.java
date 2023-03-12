public class SmallestInArray {
    public static int findSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int arr[] = {0, 2, 6, 3, 5};
        System.out.println("Smallest element is:" + findSmallest(arr));
    }
}
