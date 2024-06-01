import java.util.*;
public class AggressiveCows {
    public static boolean isPossible(int[]stalls, int minDist, int k)
    {
        int cows=1;  // place it at stalls[0]
        int lastCowPosition=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-lastCowPosition>=minDist)
            {
                cows++;
                lastCowPosition=stalls[i];
                if(cows>=k) {

                    return true;
                }
            }
        }
        return false;
    }

    public static int aggressiveCows(int[]stalls, int k)
    {
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=Integer.MAX_VALUE; 
        int res = 0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(stalls,mid,k))
            {
                res=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return res;
    }
    // public static void main(String[] args) {
    //     // int no [] = {1,2,8,9,5,3};
    //     // int cows = 4;

    //     int no[] = {1, 2, 4, 8, 9};
    //     int cows = 3;
        
    //     System.out.println(aggressiveCows(no, cows));
    // }
    public static void main(String[] args) {
        int no [] = {1,2,8,9,5,3};
        int cows = 4;

        Arrays.sort(no);

        int arr[] = new int [cows];
        arr[0] = no[0];
        arr[arr.length - 1] = no[no.length - 1];
        cows -= 2;

        int start = 1;
        int end = no.length - 1;
        int count= 1;

        while(cows > 0){
            int mid = (start + end) / 2;
            start = mid;

            arr[count] = no[mid];

            cows--;
            count++;
        }
         int minimum = Integer.MAX_VALUE;

         for(int i = 0 ; i < arr.length -1;i++){
            int sub = arr[i + 1] - arr[i];
            minimum = Math.min(sub, minimum);
         }



         for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
         }
    }

}
