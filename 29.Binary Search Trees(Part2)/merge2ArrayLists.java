import java.util.*;
public class merge2ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>mList = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
               mList.add(list1.get(i));
               i++;
            }else{
                mList.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()){
            mList.add(list1.get(i));
               i++;
        }
        while(j < list2.size()){
            mList.add(list2.get(j));
                j++;
            
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mList);
        
    }
}
