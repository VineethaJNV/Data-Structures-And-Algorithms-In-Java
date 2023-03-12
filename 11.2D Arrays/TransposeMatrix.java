public class TransposeMatrix {
    public static void printArr(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void transposeMat(int arr[][]){
        int transposeMat[][] = new int[arr[0].length][arr.length];
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                transposeMat[j][i] = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;
            }
        }
        printArr(transposeMat);
        return;
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6}};
        printArr(arr);
        transposeMat(arr);
    }
}
