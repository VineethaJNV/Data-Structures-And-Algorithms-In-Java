public class UpperToLowerHW3 {
    //Convert uppercase characters to lowercase using bits
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++) {
            System.out.println((char)(ch|' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
