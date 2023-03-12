public class ReverseOfANum {
    public static void main(String[] args){
        int n = 10899; //o/p = 99801
        int digit = 0;
        int rev = 0;
        while(n > 0){
            digit = n % 10;
            rev = rev*10 + digit;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
