import java.util.Stack;
public class NextGreaterElemenet {
    //next greater right
    //next greater left
    //next smaller right
    //next smaller left
    public static void findNextGreater(Stack<Integer>s, int arr[], int result[]){

        //looping from backwards
        for(int i = arr.length - 1; i>= 0; i--){

            //1.while loop => until stack is empty and you remove all emenets smaller than current element, pop the elements
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2.if -else condition
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = arr[s.peek()];
            }
            //3.push in stack
            s.push(i);

        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = new int[arr.length];
        Stack<Integer>s = new Stack<>();
        findNextGreater(s, arr, result);

        for(int i = 0 ;  i < result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
