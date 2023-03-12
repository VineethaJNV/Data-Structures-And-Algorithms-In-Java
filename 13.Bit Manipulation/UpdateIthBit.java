public class UpdateIthBit {
    public static int UpdateIthBit(int n, int i, int bit){
        int bitMask = (1<<i);
        if(bit == 0){//clearIthBit
           
            return n & (~bitMask);
        }else{//setIthBit
            return n | bitMask;
        }

    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1));
        System.out.println(UpdateIthBit(10, 1, 0));
        
    }
}
