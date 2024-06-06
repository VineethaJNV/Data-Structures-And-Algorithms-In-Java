package June4;

public class StaticReason {
    void printHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        StaticReason sr = new StaticReason();
        sr.printHello();
        // printHello();
    }
}
