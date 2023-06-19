import java.util.*;
public class UnionAndIntersectionArrays {
    public static void findUnionAndIntersection(int arr1[], int arr2[]){
        HashSet<Integer> unionSet = new HashSet<>();
        HashSet<Integer>intersectionSet = new HashSet<>();
        for(int i = 0 ; i < arr1.length; i++){
            unionSet.add(arr1[i]);
        }
        System.out.println("Intersection elements are: ");
        for(int j = 0; j < arr2.length; j++){
           if( unionSet.contains(arr2[j])){
                intersectionSet.add(arr2[j]);
            }
        }
        System.out.println(intersectionSet);
        for(int j = 0 ; j < arr2.length; j++){
            unionSet.add(arr2[j]);
        }
        System.out.println("Union of 2 arrays is: "+unionSet);
    }
    public static void main(String[] args) {
        int arr1[] ={7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        findUnionAndIntersection(arr1, arr2);
        
    }
}
