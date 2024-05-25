public class SubArrSum {
    public static int[] findInterval(int arr[], int sum){

        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                int currSum = 0;
                for(int k = i;  k <= j; k++){
                    System.out.print(arr[k]+" ");
                    currSum += arr[k];
                    if(currSum == sum){
                        result[0] = i-1;
                        result[1] = j;
                    }
                }
                System.out.println();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 7, 5};
        int sum =12; // 2, 4
        int result[] = new int[2];
        result =  findInterval(arr, sum);
        System.out.println(result[0]+" "+result[1]);
    }
}
