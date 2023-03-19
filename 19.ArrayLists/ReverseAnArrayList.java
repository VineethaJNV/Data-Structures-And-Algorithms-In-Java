import java.util.ArrayList;
public class ReverseAnArrayList {
    public static void reverseList(ArrayList<Integer>list){
        for(int i = 0 ; i < list.size()/2; i++){
            int element1 = list.get(i);
            int element2 = list.get(list.size()-i-1);
            list.set(i, element2);
            list.set(list.size()-i-1, element1);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
}
