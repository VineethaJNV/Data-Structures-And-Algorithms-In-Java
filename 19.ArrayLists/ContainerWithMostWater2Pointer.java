import java.util.ArrayList;
public class ContainerWithMostWater2Pointer {
    public static int containerWithMostWater2Pointer(ArrayList<Integer>list){
        int maxWater = 0;
        int leftPt = 0;
        int rightPt = list.size()-1;

        while(leftPt < rightPt){
            int height = Math.min(list.get(rightPt), list.get(leftPt));
            int width = rightPt-leftPt;
            int currWater = height*width;
            maxWater = Math.max(maxWater, currWater);

            //upadte pointers
            if(list.get(leftPt) < list.get(rightPt)){
                leftPt++;
            }else{
                rightPt--;
            }
        }
        return maxWater;
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
        System.out.println(containerWithMostWater2Pointer(height));
    }
}
