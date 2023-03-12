public class ClearRangeOfBits {
    public static int ClearRangeOfBits(int n, int i, int j){ // i<j
        // we need to clear bits which are in between i & j
        // our bitmask will have all 1's before i and after j
        //divide it into 2 parts => a | b
        // a => (~0) << j+1 => 111110000000
        //b =>  (1<<i)-1  => 000000000011
        //perform & with bitmask and return
        int a = (~0) << (j+1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearRangeOfBits(10, 2, 4));
    }
}
