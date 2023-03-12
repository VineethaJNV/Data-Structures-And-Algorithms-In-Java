public class HW1 {
    //For a given integer array of size N.You have to find all the occurrences(indices)
    //of a given element(Key) and print them.Use a recursive function to solve this problem
    public static void findOccurances(int arr[], int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        findOccurances(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[]=  {3,2,4,5,6,2,7,2,2};
        findOccurances(arr, 0, 2);
        
    }
}
