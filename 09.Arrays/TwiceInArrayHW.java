import java.util.HashMap;
public class TwiceInArrayHW {
    /*Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct. */
public static boolean findDuplicates(int arr[]){
    for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                return true;
            }
        }
    }
    return false;
}
public static boolean usingHashmap(int arr[]){
    HashMap<Integer, Integer>map = new HashMap<>();
    for(int i = 0 ; i < arr.length; i++){
        if(! map.containsKey(arr[i])){
            map.put(arr[i], 1);
        }else{
            map.put(arr[i], map.get(arr[i])+1);
        }
    }
    for(int i = 0; i < arr.length; i++){
        if(map.get(arr[i]) > 1){
            return true;
        }
    }
    return false;
}
public static void main(String[] args){
    int arr[] = {1,1,1,3,3,4,3,2,4,2}; //true
    int arr1[] = {1,2,3,1};//true
    int arr2[] = {1,2,3,4};// false
    System.out.println(findDuplicates(arr));
    System.out.println(findDuplicates(arr1));
    System.out.println(findDuplicates(arr2));
    System.out.println(usingHashmap(arr));
    System.out.println(usingHashmap(arr1));
    System.out.println(usingHashmap(arr2));



}
}
