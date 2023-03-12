public class HW1 {
    public static int countSeven(int arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    /*Print the number of 7’s that are inthe 2d array */
    public static void main(String[] args){
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.println(countSeven(arr));
    }
}
