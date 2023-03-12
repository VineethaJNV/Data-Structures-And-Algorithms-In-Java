public class LargestInArray {
    //Find the largest number in the given array
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE; // - infinity
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] = {1,2,60,20,15};
        System.out.println("Largest value element is :"+findLargest(arr));
    }
}
