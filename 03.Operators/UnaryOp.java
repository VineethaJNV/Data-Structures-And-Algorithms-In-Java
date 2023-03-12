public class UnaryOp {
    public static void main(String[] args){
        int a = 10;
        int b = ++a; // increment and use
        System.out.println(a);
        System.out.println(b);

        int c = 20;
        int d = c++; // use and later increment
        System.out.println(c);
        System.out.println(d);

        int e  = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);


    }
}
