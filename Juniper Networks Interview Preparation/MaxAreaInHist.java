import java.util.Stack;
public class MaxAreaInHist {
    public static int maxArea(int [] heights){
        Stack<Integer>s = new Stack<>();
        int msl[] = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            int curr = heights[i];
            while(! s.isEmpty() && heights[s.peek()] > curr){
                s.pop();
            }
            if(s.isEmpty()){
                msl[i] = -1;
            }else{
                msl[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<Integer>();
        int msr[] = new int[heights.length];
        for(int i = heights.length-1; i >= 0 ; i--){
            int curr = heights[i];
            while(! s.isEmpty() && heights[s.peek()] > curr){
                s.pop();
            }
            if(s.isEmpty()){
                msr[i] = 6;
            }else{
                msr[i] = s.peek();
            }
            s.push(i);
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i<heights.length; i++){
            int height = heights[i];
            int width = msr[i] - msl[i] - 1;
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea);
        }
        printArr(msl);
        printArr(msr);
        return maxArea;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int heights [] = {2, 1, 5, 6, 2, 3};
        System.out.println("Max rectangle area in histogram = "+ maxArea(heights));
    }
}
