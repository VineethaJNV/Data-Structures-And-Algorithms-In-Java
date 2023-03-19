import java.util.ArrayList;
public class PairSum2Pointer {
    public static boolean targetSum2Pointer(ArrayList<Integer>list, int target){
        int leftpt = 0 ;
        int rightPt = list.size()-1;

        while(leftpt < rightPt){
            if(list.get(leftpt) + list.get(rightPt) == target){
                return true;
            }
             //updation
             if(list.get(leftpt) + list.get(rightPt) < target){
                leftpt++;
            }else{
                rightPt--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int target = 5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(targetSum2Pointer(list, target));
    }
}
