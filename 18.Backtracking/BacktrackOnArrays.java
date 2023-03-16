public class BacktrackOnArrays{
    /*Write a program to assign 1,2,3,4,5 to an array while travelling up and
     deduct 2 while backtrack */
    public static void ArrayBacktrack(int arr[], int i){
        if(i == arr.length){
            return;
        }
        arr[i] = i+1;
        ArrayBacktrack(arr, i+1);
        arr[i] -=2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayBacktrack(arr, 0);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}