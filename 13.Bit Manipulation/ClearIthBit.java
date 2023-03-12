import javax.swing.plaf.synth.SynthSeparatorUI;

public class ClearIthBit {
    public static int clearIthBit(int n, int i){//we need a bit mask which affects our ith position => 1 << i
    //If we perform & operation with 0 => the result is always zero
    //We need to clear a bit, that bit should become zero, and remaining should remain same
    //Bit mask has 1 at ith bit, to clear ith bit, we need zero to perform &
    // so, simply negate bitmask and perform & operation to clear the bit
    int bitMask = 1 << i;
    return n & (~bitMask);

    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
        
    }
}
