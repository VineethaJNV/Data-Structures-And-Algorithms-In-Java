import java.util.Scanner;
public class MaxAndMinIn2DArr {
    public static int findMinElement(int arr[][]){
        int minEle = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] < minEle){
                    minEle = arr[i][j];
                }
            }
        }
        return minEle;
    }
    public static int findMaxElement(int arr[][]){
        int maxEle = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] > maxEle){
                    maxEle = arr[i][j];
                }
            }
        }
        return maxEle;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println("Enter the element to store at ("+i+","+j+")");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Smallest element in the array is"+" "+findMinElement(arr));
        System.out.println("Largest element in the array is"+" "+findMaxElement(arr));

    }
}
