import java.util.ArrayList;
public class ContainerWithMostWaterBruteForce {//bruteforce
    public static int containerWithMostWater(ArrayList<Integer>list){ //O(N^2)
        int maxWaterLevel = Integer.MIN_VALUE;
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++){
                int width = j-i;
                int height = Math.min(list.get(i), list.get(j));
                int currWaterLevel = height*width;
                maxWaterLevel = Math.max(maxWaterLevel, currWaterLevel );
            }
        }
        return maxWaterLevel;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(containerWithMostWater(height));

    }
}
