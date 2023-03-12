public class HW2 {
    /* Print out the sum of the numbers inthe second row of the “nums” array */
    public static int secondRowSum(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr[0].length; i++){
            System.out.println(arr[2][i]);
            sum += arr[1][i];
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("Second row sum is : "+secondRowSum(arr));

    }
}
