public class PairSum {
    public static boolean isPair(int arr[], int key){
        int lp = 0;
        int rp = arr.length-1;

        while(lp < rp){
            if(arr[lp] + arr[rp] == key){
                return true;
            }else if(arr[lp] + arr[rp] > key){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 10;
        System.out.println(isPair(arr, key));

    }
}
