import java.util.Arrays;
public class BulbSwitcher {
    /*There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
   On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
 Return the number of bulbs that are on after n rounds. */
    public static int bulbSwitch(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int arr[] = new int[n];
        Arrays.fill(arr, -1); // off state

        for(int i = 0 ; i < arr.length; i++){
           if(i == 0){
                Arrays.fill(arr, 1);
           }else if( i == n -1){
                if(arr[i] == 0){
                    arr[i] = 1;
                }else{
                    arr[i] = 0;
                }
           }else{
            if(arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
           }
            
        }
        // printArr(arr);
        int count = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(bulbSwitch(n));
        
    }
}
