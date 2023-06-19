import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class MinimumTimeRequiredToFillNSlots {
    public static int findMinTime(int arr[],int n, int k){
        Queue<Integer>q = new LinkedList<>();
        boolean visited[] = new boolean[n+1];
        int time = 0;
        for(int i = 0 ; i < k; i++){
            q.add(arr[i]);
            visited[arr[i]] = true;
        }
        while(! q.isEmpty()){
            for(int i = 0 ; i < q.size(); i++){
                int curr = q.remove();
                if(curr - 1 > 1 && ! visited[curr-1]){
                    visited[curr - 1] = true;
                    q.add(curr-1);
                }
                if(curr + 1 <= n && !visited[curr+1]){
                    visited[curr+1] = true;
                    q.add(curr+1);
                }
            }
            time++;
        }
        return time - 1;    
    }
    public static void main(String[] args) {
        int  n = 6;
        int k = 2;
        int arr[] = {2, 6};
        System.out.println(findMinTime(arr, n, k));
    }
}
