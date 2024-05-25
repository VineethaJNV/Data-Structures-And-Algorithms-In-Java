public class BinStringWithoutConseOnes {
    public static void printBinStrings(int n, int ch, String ans){
        if(n == 0){
            System.out.println(ans);
            // ans ="";
            return;
        }
        if(ch == 0){
            printBinStrings(n-1, 0, ans+"0");
            printBinStrings(n-1, 1, ans+"1");
        }else{
            printBinStrings(n-1, 0, ans+"0");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printBinStrings(n, 0, "");
    }
}
