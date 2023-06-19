public class ConntainerWithMostWater {
    public static int findContainer2ptr(int arr[]){
        int lp = 0;
        int rp = arr.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while(lp < rp){
            int width = rp - lp;
            int height = Math.min(arr[rp], arr[lp]);
            int currWater = width*height;
            maxWater = Math.max(maxWater, currWater);
            if(arr[lp] < arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int mostWater = 0;
        for(int i = 0; i < arr.length-1; i++){
            
            for(int j = i+1; j < arr.length; j++){
                int width = j-i;
                int height = Math.min(arr[i], arr[j]);
                // System.out.println("width = "+width+" "+"height = "+height+" "+"Water = "+width*height);
                mostWater = Math.max(mostWater, height*width);
            }
        }
        System.out.println("Container with Most water ="+mostWater);

        System.out.println("Most water using 2 ptr"+" "+findContainer2ptr(arr));
    }
}
