import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        Integer arr1[]= {7, 3, 9};
        Integer arr2[]= {6, 3, 9, 2, 9, 4};

        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0 ; i< arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i = 0 ; i< arr2.length; i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union of 2 sets is: "+hs);

        for(int i = 0;i  < arr1.length; i++){
            hs.remove(arr1[i]);
        }
        System.out.println(hs);

        HashSet<Integer>intersection = new HashSet<>();
        for(int i = 0 ;i < arr2.length; i++){
            if(! hs.contains(arr2[i])){
                intersection.add(arr2[i]);
            }
        }
        System.out.println("intersection of 2 sets is: "+ intersection);

    }
}
