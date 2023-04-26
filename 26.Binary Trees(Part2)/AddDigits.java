public class AddDigits {
    /*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it. */
    public static int addDigits(int num) {
        int result = 0;
        if( num == 0 || num < 10){
            return num;
        }
        while(num > 0){
            int rem = num % 10;
            result += rem;
            num = num / 10;
            if(num == 0 && result >= 10){
                num = result;
                result = 0;
            }
        }
        System.out.println(num);
        return result;
        
    }
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }
}
