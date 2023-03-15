public class HW2 {
    //Given an array nums of size n, return the majority element. (MEDIUM)
    //The majority element is the element that appears more than ⌊n/2⌋ times.
    //You may assume that the majority element always exists in the array
    public static int findMajority(int arr[]){
        int nby2 = arr.length / 2;
        for(int i = 0 ; i  < arr.length; i++){
            int count= 0 ;
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count >= nby2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {2,2,1,1,1,2,2};
        int arr[] = {3,2,3};
        System.out.println(findMajority(arr));
        
    }
}
