import java.util.ArrayList;
public class Swap2Num {
    public static void swapNum(ArrayList<Integer>list, int idx1, int idx2){
        int element1 = list.get(idx1);
        int element2 = list.get(idx2);
        list.set(idx1, element2);
        list.set(idx2, element1);

        return;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        swapNum(list, 0, 4);
        System.out.println(list);
    }
}
