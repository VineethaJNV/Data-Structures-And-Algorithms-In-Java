public class PrintOneToTen{
    public static void printRec(int n){
        if(n == 0){
            return;
        }
        printRec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        printRec(10);
        // int counter = 1;

        // while(counter <= 10){
        //     System.out.println(counter);
        //     counter++;
        // }
    }
}