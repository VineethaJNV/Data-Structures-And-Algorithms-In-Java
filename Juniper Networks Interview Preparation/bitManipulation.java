public class bitManipulation {
    public static void evenOrdd(int n){
        int bitMask = 1;
        if( (n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = i <<i;
        return bitMask | n;
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        // evenOrdd(10);
        // evenOrdd(15);
        // evenOrdd(11);
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
    }
}
