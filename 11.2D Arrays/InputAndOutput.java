import java.util.Scanner;
public class InputAndOutput{
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

    }
}