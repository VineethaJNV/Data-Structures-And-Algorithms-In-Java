import java.util.Queue;import java.util.LinkedList;;
public class HW1GenerateBinaryNums {
    //Given a number N, generate and print all the binary numbers with decimal values from 1 to N
    public static void printBinNums(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while(n > 0){
            String s1 = q.peek();
            System.out.println(s1);
            q.remove();
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
            n--;
        }

    }
    public static void main(String[] args) {
       int n = 10;
       printBinNums(n);
    }
}
