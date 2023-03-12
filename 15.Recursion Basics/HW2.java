public class HW2 {
    //You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  
    //Use a recursive function to solve this problem.
    //NOTE-The digits of the number will only be in the range 0-9 and the last digit of
    //a number can’t be 0
    public static void convertNumber(int number, String map[], String str){
        if(number <= 0){
            System.out.println(str);
            return;
        }
        int lastDigit = number % 10;
        convertNumber(number / 10, map, map[lastDigit] +" "+str);
    }
    public static void main(String[] args) {
        String map[] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
        convertNumber(2019, map, "");
        String str = "";
        System.out.println(str.length());
    }
}
