import java.util.ArrayList;
public class FindMaxInArrayList {
    public static int findMax(ArrayList<Integer>list){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < list.size(); i++){
            int curr = list.get(i);
            max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(100);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // list.add(1000);
        System.out.println("The maximum number in the given arraylist is:"+findMax(list));
    }
}
