public class FunctionOrMethodOverLoadingUsingParameters {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    // public static void sum(int a, int b){

    // }
    public static void main(String[] args){
        System.out.println(sum(5,3));
        System.out.println(sum(5,2,1));
    }
}
