public class CountSetBits {
    public static int countSetBits(int n){
        int count = 0;
        while(n >0){ // don't include >=, 0 >> 1 is always 0 => will be an infinite loop
            if((n & 1) == 1){
                count++;
            }
            n =n >>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        
    }
}
