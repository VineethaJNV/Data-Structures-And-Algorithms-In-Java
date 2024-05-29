public class GeekLandFair {
    public static int findMax(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            largest = Math.max(nums[i], largest);
        }
        return largest;
    }
    public static long findK(int[] nums){
        long TotalJuiceDrankByGeekina = 0;
        for(int i = 0; i < nums.length; i++){
            TotalJuiceDrankByGeekina += nums[i];
        }

        long k = findMax(nums); //Our K can start from largest of the nums to satisfy k-nums[i] >= 0
        long TotalJuiceByGeek= 0;

        while(TotalJuiceByGeek <= TotalJuiceDrankByGeekina){
            for(int i = 0; i < nums.length; i++){
                TotalJuiceByGeek += k - nums[i];
            }
            if(TotalJuiceByGeek > TotalJuiceDrankByGeekina){
                break;
            }else{
                TotalJuiceByGeek = 0;
                k++;
            }
            
        }

        return k;
    }
    public static void main(String[] args) {
        int n = 8;
        int nums[] = {5, 7, 4, 8, 10, 9, 0, 6};
        System.out.println(findK(nums));
    }
}
