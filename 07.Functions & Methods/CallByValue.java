public class CallByValue {
    public static int modifyA(int num){
        num = num +10;
        return num;
    }
    public static void main(String [] args){
        int a =10;
         int newA = modifyA(a);
         System.out.println(a); // a is not modified by modifyA function because 
                                // formal parameters are a copy of actual parameters
                                // the call is "call by value"
         System.out.println(newA);
    }
}
