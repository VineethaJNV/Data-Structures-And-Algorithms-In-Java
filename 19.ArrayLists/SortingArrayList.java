import java.util.Collections;
import java.util.ArrayList;
public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(0);
        list.add(100);
        list.add(50);
        System.out.println(list);
        Collections.sort(list); //Ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //Descending
        //Comparator => comparing function logic
        System.out.println(list);

    }
}
