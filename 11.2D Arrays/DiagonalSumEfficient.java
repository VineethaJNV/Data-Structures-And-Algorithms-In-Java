public class DiagonalSumEfficient {
    public static int findDiagSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){ //O(n)
             sum += matrix[i][i];

             if( i != matrix.length - i - 1){
                sum += matrix[i][matrix.length - i -1];
             }
        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}};
    }
}
