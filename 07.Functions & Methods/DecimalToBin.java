public class DecimalToBin {
    public static int decToBin(int n){
        int binary = 0;
        /* while(n > 0){
            rem = n % 2;
            bin = bin + rem * Math.pw(10, pow);
            pow++;
            n = n/2;
        } */

        while(n > 0){
            int rem = n % 2;
            binary = binary * 10 + rem;
            n = n/2;
        }
        return binary;

    }
    public static void main(String[] args){
        System.out.println(decToBin(15));

    }
}
