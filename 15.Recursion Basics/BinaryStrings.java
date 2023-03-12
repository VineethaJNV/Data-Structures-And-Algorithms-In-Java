public class BinaryStrings {
    //Print all binary Strings of size n without consecutive ones
    public static void printBinaryStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        //work
        if(lastPlace == 0){
            printBinaryStrings(n-1, 0, str+"0");
            printBinaryStrings(n-1, 1, str+"1");
        }else{
            printBinaryStrings(n-1, 0, str+"0");
        }
       
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
