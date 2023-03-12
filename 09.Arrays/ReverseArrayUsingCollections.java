import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayUsingCollections {
    public static void main(String[] args){
        Integer arr[] = {2, 4, 6, 8, 10};
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
