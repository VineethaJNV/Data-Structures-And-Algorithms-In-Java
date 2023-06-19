import java.util.*;
public class LargestSubArrayWithZeroSum {
    public static void subArrays(int arr[]){
        int maxLength = 0;
        for(int i =  0; i < arr.length; i++ ){
            // System.out.print(arr[i] +" ");
            
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                int length = 0;
                for(int k = i; k<= j ;k++){
                    length++;
                    System.out.print(arr[k] +" ");
                    sum+=arr[k];
                    if(sum == 0){
                        maxLength = Math.max(length, maxLength);
                    }
                }
                System.out.print("=: "+sum +"and length is" + length);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("max length is: "+maxLength);
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        subArrays(arr);
        HashMap<Integer, Integer>map = new HashMap<>();

        int length = 0 ;
        int sum = 0;
        for(int j = 0 ; j < arr.length; j++){
            sum += arr[j];
            int currLen = 0;
            if(map.containsKey(sum)){
                int i = map.get(sum);
                currLen = j - i;
                length = Math.max(length, currLen);
            }else{
                map.put(sum, j);
            }
        }
        System.out.println("Maximum sub array with sum equal to 0 is of length: "+length);

    }
}
