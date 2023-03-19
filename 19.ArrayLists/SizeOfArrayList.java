import java.util.ArrayList;
public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(15);
        System.out.println(list.size());

        for(int i = 0 ; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
