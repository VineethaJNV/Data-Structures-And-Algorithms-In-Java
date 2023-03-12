import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //char ch = sc.next();
        String line = sc.nextLine();
        float floatNum = sc.nextFloat();
        double doubleNum = sc.nextDouble();
        long longNum = sc.nextLong();
        System.out.println(num);
       // System.out.println(ch);
        System.out.println(line);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(longNum);


    }
}
