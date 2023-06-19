import java.util.Stack;
public class nextGreaterEle {
    public static void FindNextGreaterRight(int arr[], int result[]){//O(n^2)
        result[result.length-1] = -1;
        for(int i = 0; i <  arr.length-1; i++){
            for(int j = i+1; j < arr.length -1; j++){
                if(arr[j] >arr[i]){
                    result[i] = arr[j];
                    break;
                }else{
                    result[i] = -1;
                }
            }
        }
    }
    public static void findNextGreater(int arr[]){
        Stack<Integer>s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            int currElement = arr[i];
            while(!s.isEmpty() && s.peek() < currElement){
                s.pop();
            }if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = s.peek();
            }
            s.push(currElement);

            
        }
        System.out.println("Next greater using Stack: ");
        printArr(nextGreater);
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int result[] = new int[arr.length];
        // FindNextGreaterRight(arr, result);
        // printArr(result);
        findNextGreater(arr);
    }
}
