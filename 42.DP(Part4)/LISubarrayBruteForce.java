public class LISubarrayBruteForce {
    public static void findSubSequences(int nums[]){
        int longest = 0;
        for(int i =  0; i < nums.length; i++){
            int local = 0;
            for(int j = i+1; j < nums.length-1; j++){
                int curr = nums[j];
                int next = nums[j+1];
                if(curr < next){
                    local++;
                }
                
            }
           
            longest = Math.max(longest, local);
            
        }
        System.out.println(longest+" longest");
    }
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        findSubSequences(nums);
    }
}
