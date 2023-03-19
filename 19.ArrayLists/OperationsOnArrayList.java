import java.util.ArrayList;
public class OperationsOnArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean>list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(90);  //O(1)
        list.add(91);
        list.add(92);
        System.out.println(list);
        list.add(93);
        System.out.println(list);
        System.out.println(list.get(2));  // O(1)

        list.remove(2);
        System.out.println(list); //O(n)  => searching and removing

        list.set(2, 100);  // O(n)  =>Reaching to that element and changing it
        System.out.println(list);

       System.out.println( list.contains(100));
       System.out.println( list.contains(0));

       list.add(1, 10);  //O(n) => moves elements
       System.out.println( list);
    }
}