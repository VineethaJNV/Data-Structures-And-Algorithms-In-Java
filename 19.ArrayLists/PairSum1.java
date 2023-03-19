import java.util.ArrayList;
public class PairSum1 {
    //Find if any pair in a Sorted ArrayList has a target sum.
    public static boolean targetSum(ArrayList<Integer>list, int target){
        for(int i = 0 ; i < list.size(); i++){
            for(int j = i +1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
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
        System.out.println(targetSum(list, target));
    }
}
