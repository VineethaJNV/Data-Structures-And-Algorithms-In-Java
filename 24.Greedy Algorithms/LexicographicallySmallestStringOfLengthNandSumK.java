import java.util.Arrays;
public class LexicographicallySmallestStringOfLengthNandSumK {
    /*Given two integers N and K. The task is to print the lexicographically 
    smallest string of length N consisting of lower-case English alphabets 
    such that the sum of the characters of the 
    string equals K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ….. and ‘z’ = 26. */
    public static char[] lexo_small(int n, int k){
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for (int i = n - 1; i >= 0; i--) {
            k -= i;
            if (k >= 0) {
                if (k >= 26) {
                    arr[i] = 'z';
                    k -= 26;
                }else {
                    arr[i] = (char)(k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            }else
            break;
            k += i;
        }
        return arr;
    }
    //public static String findLexicographical(int N, int K){
        // char arr[] = new char[27];
        // arr[0] = '0';
        // char ch = 'a';
        // for(int i = 1; i< arr.length; i++){
           
        //     arr[i] = ch;
        //     ch++;
        // }
        // for(int i = 0 ; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        //     String result = "";
        // for(int i = arr.length -1; i>= 1; i--){
        //     if( i <= K){
        //         while( i <= K){
        //             result += arr[i];
        //             System.out.println(result);
        //             N--;
        //             K -= i;
        //         }
        //     }
        // }
        // return result;
    //}
    public static void main(String[] args) {
        //System.out.println("Lexicographically smallest string possible is: "+lexo_small(5, 42));
        int n = 5, k = 42;
        char arr[] = lexo_small(n, k);
        System.out.print(new String(arr));
    }
}
