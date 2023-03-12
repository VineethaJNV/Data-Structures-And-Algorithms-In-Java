import java.util.Scanner;
public class ArraysPassByReference {
    public static void modifyArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] += 5;
        }
        return;
    }
    public static void main(String [] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        modifyArray(arr);
        System.out.println("Modified array elements are:");
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
