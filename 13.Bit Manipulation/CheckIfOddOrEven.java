public class CheckIfOddOrEven {
    /*1 => 001  4 => 100    7 => 111    odd numbers has 1 in their L.S.B
     *2 => 010  5 => 101    8 => 1000   For a given number get it's L.S.B by performing
      3 => 011  6 => 110    9 => 1001   AND operation with 1
     */
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(9);
        oddOrEven(10);
    }
}
