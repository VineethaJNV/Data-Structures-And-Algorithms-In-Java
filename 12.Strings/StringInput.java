import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next(); // Takes only one word as input
        System.out.println("Your name is :"+name);

    }
}
