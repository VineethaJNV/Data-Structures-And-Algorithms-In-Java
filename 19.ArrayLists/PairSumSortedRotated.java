import java.security.KeyFactory;
import java.util.ArrayList;
public class PairSumSortedRotated {
    //Find if any pair in a sorted and rotated ArrayList has a target sum
    public static boolean rotatedTargetSum(ArrayList<Integer>list, int target){
        int rightPt =0;
        int leftPt = 0;
        int pivot = 0;

        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) < list.get(i+1)){
                rightPt = i;
                leftPt = i+1;
                break;
            }
        }
        while(leftPt != rightPt){
            if(list.get(leftPt) + list.get(rightPt) == target){
                return true;
            }
            //updation
            if(list.get(rightPt) + list.get(leftPt) < target){
                leftPt = (leftPt+1)%list.size();
            }
            if(list.get(rightPt) + list.get(leftPt) > target){
                rightPt = (list.size()+rightPt-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int target = 16;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(rotatedTargetSum(list, target));
        
    }
}
