public class GetIthBit {
    public static void getIthBit(int n, int i){ // perform AND OPERATION WITH bITmASK
        int bitMask = 1 << i;

        if((bitMask & n)  == 0){
            System.out.println("the bit is 0");
        }else{
            System.out.println("the bit is 1");
        }
    }
    public static void main(String[] args) {
        getIthBit(5,2);
    }
}
