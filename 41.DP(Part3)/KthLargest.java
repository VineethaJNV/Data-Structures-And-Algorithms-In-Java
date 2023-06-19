import java.util.ArrayList;
import java.util.Collections;
public class KthLargest {
    int k;
    ArrayList<Integer>stream = new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i = 0; i < nums.length; i++){
            this.stream.add(nums[i]);
        }
    }
    
    public int add(int val) {
        this.stream.add(val);
        System.out.println("Stream before sorting: "+stream);
        Collections.sort(stream);
        System.out.println("Stream after sorting: "+stream);
        System.out.println("k value is: "+k);
        return stream.get(stream.size()-k);
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest obj = new KthLargest(3, nums );
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));

    }
    
}
