public class PowerOfTwoOrNot {
    public static boolean isTwosPower(int n){
        // 4 => 100     8 => 1000     observe carefully, 2's power will always have
        // 3 => 110     7 => 0111     only one 1.Perform 7 with n-1 => if 0 => it is 2s complement
        // if((n &(n-1)) == 0){
        //     return true;
        // }else{
        //     return false;
        // }
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isTwosPower(16));
        System.out.println(isTwosPower(15));
    }
}
