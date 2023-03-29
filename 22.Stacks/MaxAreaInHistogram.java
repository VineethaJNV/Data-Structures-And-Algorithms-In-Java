import java.util.Stack;
public class MaxAreaInHistogram {//O(n)
    //Given an array of integers heights representing the histogram's bar
    //height where the width of each bar is 1, return the area of the 
    //largest rectangle in the histogram
    public static int maxAreaInHist(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer>s = new Stack<>();
        //Next Smaller Right
        for(int i = arr.length -1; i>=0; i--){
            while(! s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(! s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i = 0 ; i <arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height*width;
            // System.out.println(height +" "+width);
            // System.out.println(currArea);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum Area in the histogram is: "+maxAreaInHist(arr));
    }
}
