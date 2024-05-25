public class InverseSpiral {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                            {4, 5, 6}, 
                            {7, 8, 9}}; //5, 6, 9, 8, 7, 4, 1, 2, 3
        int n = matrix.length; int m = matrix[0].length;
        int sr = 0; int sc = 0;
        int er = n-1; int ec = m-1;
        int midrow = n/2; int midcol = m/2;
        while(sr <= er && sc <= ec){
            for(int i = midcol; i <= ec; i++){
                System.out.print(matrix[midrow][i]+" ");
            }
            for(int j = midrow+1; j <= er; j++){
                System.out.print(matrix[j][ec]+" ");
            }
            for(int i = ec-1; i >= sc; i--){
                System.out.print(matrix[er][i]+" ");
            }
            for(int j = er-1; j >= sr; j--){
                System.out.print(matrix[j][sc]+" ");
            }
            for(int i = sc+1; i <= ec; i++){
                System.out.print(matrix[sr][i]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
            
        }
    }
}
