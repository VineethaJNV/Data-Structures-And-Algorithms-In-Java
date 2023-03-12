public class LinearSearchOn2DArray {
    public static boolean linearSearch(int arr[][], int key){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] == key){
                    System.out.println("element is found at : ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[][] = {{10, 20, 30},{1, 2, 3},{7, 8, 9},{100, 50,70}};
        int key = 7;
        System.out.println(linearSearch(arr, key));
    }
}
