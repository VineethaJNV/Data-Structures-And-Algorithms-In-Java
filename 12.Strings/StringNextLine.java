import java.util.Scanner;
public class StringNextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your school name:");
        
        String school = sc.next(); // Takes only one word as input
        System.out.println("Your school name is :"+school);

        System.out.println("Enter your school name:");
        String name = sc.nextLine(); // Takes only one word as input
        System.out.println("Your school name is :"+name);

    }
}
