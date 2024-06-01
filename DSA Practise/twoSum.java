public class twoSum{
    public static int[]  twoSum(int[] nums, int target) {
        int[] result = new int [2];
        for(int i=0; i<nums.length; i++){
    for(int j=(i+1); j<nums.length; j++){
        int l=0, k=0;
        l=nums[i];
        k=nums[j];
        int sum = l+k;
        if(sum==target){
            result[0] = i;
            result[1] = j;
            System.out.println("sum of the two nums are"+ i+" , "+ j);
            break;
        }
    }
}
return result;
    }
    public static void main(String  args[]){
        int nums [] = {2,7,11,15};
        int target = 9;
       int result[] = twoSum (nums , target);
       System.out.println("The elements that sum upto the target are at index "+result[0]+" and at index "+result[1]);
    }
}