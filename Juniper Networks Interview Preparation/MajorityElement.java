import java.util.*;
public class MajorityElement {
    /*Given an array of size n find all the elements that appear more than [n/3] times */
    public static int printMajorityElement(int arr[]){ //O(n)
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            int currElement = arr[i];
            if(map.containsKey(currElement)){
                map.put(currElement,  map.get(currElement)+1);
            }else{
                map.put(currElement, 1);
            }
        }
        Set<Integer>keys = map.keySet();

        for (Integer i : keys) {
            if(map.get(i) > arr.length / 3){
                System.out.println("kay is"+" "+i+" "+"value is"+" "+map.get(i));
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        // int nums[]= { 1, 3, 2, 5, 1, 3, 1, 5, 1};
        int nums[] = {1,2};
        System.out.println(printMajorityElement(nums));

    }
}
