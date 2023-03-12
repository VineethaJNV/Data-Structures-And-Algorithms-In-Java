public class BinaryToDecimal {
    public static int BinToDec(int n){
        int decimalNum = 0;
        int pow = 0;
        int lastdigit = 0;
        while(n > 0){
            lastdigit = n % 10;
            decimalNum = decimalNum + lastdigit*(int)Math.pow(2,pow);
            n = n/ 10;
            pow++;

        }
        return decimalNum;
    }
    public static void main(String[] args){
        System.out.println(BinToDec(110));

    }
}
