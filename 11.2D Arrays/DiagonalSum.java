public class DiagonalSum {
    public static int calcDiagonalSum(int arr[][]){ //O(n^2)
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == j || i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
       // int arr[][] = { {1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
       int arr[][] = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println("Diagonal sum is : "+calcDiagonalSum(arr));
    }
    
}
