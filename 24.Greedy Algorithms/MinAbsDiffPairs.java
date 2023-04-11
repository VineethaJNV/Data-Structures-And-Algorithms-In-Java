import java.util.Arrays;
public class MinAbsDiffPairs {
    public static int findMinAbsDiff(int arr1[], int arr2[]){// nLog(n)
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minAbsDiff = 0;

        for(int i = 0 ; i < arr1.length; i++){
            minAbsDiff += Math.abs(arr1[i] - arr2[i]);
        }
        return minAbsDiff;
    }
    public static void main(String[] args) {
        // int a[] = {4,1,8,7};
        // int b[] = {2,3,6,5};
        int a[] = {1,2,3};
        int b[] = {2,1,3};
        System.out.println("Minimum absolute difference is: "+findMinAbsDiff(a, b));
    }
}
