import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class CountDistinctElements {
    public static int bruteforce(int arr[]){
        ArrayList<Integer>list = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
            if(! list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        return list.size();
       
    }
    public static void main(String[] args) {
        int arr[]= {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        HashSet<Integer>hs = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
        System.out.println("Distinct elemenets in the array is: "+hs.size());

        System.out.println("Distinct elemenets in the array using bruteforce is: "+bruteforce(arr));
    }
}
