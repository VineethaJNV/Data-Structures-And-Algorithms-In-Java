public class FindAllOccurancesOfKey {
    public static void printIdx(int[] arr, int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.println(idx);
        }
        printIdx(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printIdx(arr, 0, key);
    }
}
