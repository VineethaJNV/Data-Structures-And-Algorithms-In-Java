import java.util.*;
public class StockSpanProblem {
    public static void findSpan(int stocks[]){
        ArrayList<Integer>list = new ArrayList<>();
        int prevHigh[] = new int[stocks.length];
        int k = 1;
        prevHigh[0] = 1;
       for(int i = 1 ; i < stocks.length && k < stocks.length; i++){
        for(int j = i-1 ; j >= 0 && j< stocks.length; j--){
            System.out.println(j);
            if(stocks[j] >= stocks[i]){
                prevHigh[k] = j;
                System.out.println(k+"k");
                k++;
                break;
                
            }
        }
       }
       printArr(prevHigh);
       list.add(1);
       for(int i = 1; i < stocks.length; i++){
        list.add( i - prevHigh[i]);
       }
       System.out.println(list);
        
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        findSpan(stocks);
    }
}
