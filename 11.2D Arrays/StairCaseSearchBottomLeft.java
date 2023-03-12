public class StairCaseSearchBottomLeft {
    public static boolean stairCaseSearchUsingBottomLeft(int matrix[][], int key){
        int row = matrix.length - 1;
        int col = 0;

        while(col <= matrix[0].length - 1 && row >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key is found at: "+row+","+col);
                return true;
            }else if(key > matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,32,39,50}};
        int key = 30;
        System.out.println(stairCaseSearchUsingBottomLeft(arr,key));
    }
    
}
