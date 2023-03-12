import java.util.Arrays;
public class TrappingRainWater {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int findTrappedRainWater(int height[]){
        if(height.length == 1 || height.length == 2){
            return 0;
        }
        int leftAux[] = new int[height.length];
        leftAux[0] = height[0];
        int rightAux[] = new int[height.length];
        rightAux[rightAux.length - 1] = height[height.length -1 ];
        int trappedRainWater = 0;

        for(int i= 1; i < height.length; i++){
            leftAux[i] = Math.max(leftAux[i-1], height[i]);
        }
        for(int i = height.length - 2; i >= 0; i--){
            rightAux[i] = Math.max(rightAux[i+1], height[i]);
        }
        printArr(leftAux);
        printArr(rightAux);
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftAux[i], rightAux[i]);
            trappedRainWater += (waterLevel - height[i]);
            //System.out.println(trappedRainWater);
        }

        return trappedRainWater;
    }
    public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(findTrappedRainWater(height));

    }
}
