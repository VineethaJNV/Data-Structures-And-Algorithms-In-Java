public class FindLargestString {
    //For a given set of strings,Find the largest string in lexicographical order
    public static String findLargest(String[] strArr){
        String largest = strArr[0];
        for(int i = 1; i < strArr.length; i++){
            if(largest.compareToIgnoreCase(strArr[i]) < 0){// comparision is done with respect to s1
                largest = strArr[i];                  // s1.compareTo(s2) = 0{both equal}
                                                    //s1.compareTo(s2) > 0 {s1 > s2}
                                                    //s1.compareTo(s2) < 0 {s1 < s2}
            }
        }
        return largest;
    }
    public static void main(String[]args) {
        String arr[] = {"apple","mango","banana"};
        System.out.println(findLargest(arr));
        
    }
}
