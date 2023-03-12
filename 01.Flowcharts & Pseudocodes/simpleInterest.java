import java.util.*;
public class simpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float principle = sc.nextFloat();
        float time = sc.nextFloat();
        float rate = sc.nextFloat();
        float simpleInterest = (principle*time*rate) / 100;
        float amount = Float.sum(principle, simpleInterest);
        System.out.println("The simple interest is : " +simpleInterest);
        System.out.println("The total amount is : " + amount);
    }
}
