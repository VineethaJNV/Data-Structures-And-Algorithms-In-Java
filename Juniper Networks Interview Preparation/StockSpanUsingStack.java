import java.util.Stack;
public class StockSpanUsingStack {
    public static void calcSpan(int stocks[]){
        Stack<Integer> s = new Stack<>();
        int result[] = new int[stocks.length];
        s.push(0);
        result[0] = 1;
        for(int i = 1; i < stocks.length; i++){
            int currPrice = stocks[i];
            int topofStack = stocks[s.peek()];
            if(topofStack >= currPrice){
                result[i] = i - s.peek();
            }else{
                while(stocks[s.peek()] < currPrice){
                    s.pop();
                }
                if(s.isEmpty()){
                    result[i] = i+1;
                }else{
                    result[i] = i - s.peek();  
                }
            }
            s.push(i);
        }
        printArr(result);
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 85, 100};
        calcSpan(arr);
    }
}
