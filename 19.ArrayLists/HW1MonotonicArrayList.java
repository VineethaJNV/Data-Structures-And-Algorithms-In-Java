import java.util.ArrayList;
public class HW1MonotonicArrayList {
    /*An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise */
    public static boolean isMonotonic(ArrayList<Integer>list){
        int firstelement = list.get(0);
        int secondelement = list.get(1);

        if(firstelement < secondelement){
            for(int i = 1; i < list.size() - 1; i++){
                if(list.get(i) > list.get(i+1)){
                    return false;
                }
            }
        }else if(firstelement > secondelement){
            for(int i = 1; i < list.size() - 1; i++){
                if(list.get(i+1) > list.get(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(4);
        System.out.println(isMonotonic(list));
        
    }
}
