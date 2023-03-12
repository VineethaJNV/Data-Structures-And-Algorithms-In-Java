public class SetIthBit {
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) { //perform OR operation with Bit Mask
        System.out.println(setIthBit(10,0));
        
    }
}
