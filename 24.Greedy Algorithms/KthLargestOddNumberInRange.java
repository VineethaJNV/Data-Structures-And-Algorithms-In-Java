import java.util.*;
public class KthLargestOddNumberInRange {
    /* Given two variables L and R, indicating a range of integers from 
    L to R inclusive, and a number K, the task is to find Kth largest odd number. 
    If K > number of odd numbers in the range L to R then return 0. */
    public static int kthLargestOddNum(int L, int R, int K){
        ArrayList<Integer>list = new ArrayList<>();

        for(int i = L; i <= R; i++){
            if( i % 2 != 0){
                list.add(i);
            }
        }
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        return list.get(K-1);
    }
    public static void main(String[] args) {
        // int  L = -10, R = 10, K = 8;
        int  L = -3, R = 3, K = 1;
        System.out.println(K+"th largest odd number in the given range is: " + kthLargestOddNum(L, R, K));
    }
}
