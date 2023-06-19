public class CountSetBits {

    public static int countSetBits(int n){
       int bin = 0;
        while(n > 0){
            int rem = n % 2;
            bin = bin * 10 + rem;
            n = n / 2;
        }
        System.out.println(bin);
        int count = 0;
        while(bin > 0){
            int rem = bin % 10;
            System.out.println(rem);
            if(rem == 1){
                count++;
            }
            bin = bin/ 10;
        }
        return count;
        
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Set bits are: "+countSetBits(n));
    }
}
