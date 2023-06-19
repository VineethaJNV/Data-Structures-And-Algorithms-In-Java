import java.util.*;
public class MinOpToHalveArraySum {
    public static  int halveArray(int[] nums) {
        PriorityQueue<Double>pq = new PriorityQueue<>(Comparator.reverseOrder());
        int totSum = 0;
        for(int i = 0 ; i < nums.length; i++){
            totSum += nums[i];
        }
        int halfSum = totSum / 2;
        for(int i = 0 ; i < nums.length; i++){
            Double temp = nums[i] / 1.0;
            pq.add(temp);
        }
        Double currSum = totSum / 1.0;
        int count = 0;
        while(currSum > totSum / 2){
            Double curr = pq.poll();
            System.out.println(pq);
            pq.add(curr / 2);
            count++;
            currSum -= Math.ceil(curr*1.0 / 2);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {18,22,62,61,1,88,17,98,38,32,51,57,7,29,40,61,62,13,89,41,73,85,88,60,59,76,71,76,76,41,29,43,19,9,79};
        System.out.println(halveArray(nums));
        
    }
}
