public class ClearLastIBits {
    public static int clearLastIBits(int n, int i){
        //your required bit mask should be all 1's except at the i positions
        //to achieve that bit mask => (~0) << i or -1<<i
        //perform AND operation to clear bits
        int bitMask = -1 << i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clearLastIBits(10, 2));
    }
}
