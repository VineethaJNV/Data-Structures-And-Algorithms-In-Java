public class MergeWithoutExtraSpace {

    public static void merge(int arr1[], int arr2[]){
        int i = 0, j = 0;
        while( i < arr1.length &&  j < arr2.length){
            if(arr2[j] < arr1[i]){
                int temp = i;
                while( temp < arr1.length){
                    int x = arr1[temp+1];
                    arr1[temp+1] = arr1[temp];
                }
            }
        }

    }
    public static void main(String[] args) {
        int n = 4;
        int arr1[] = {1 ,3 ,5 ,7};
        int m = 5;
        int arr2[] = {0 ,2 ,6 ,8 ,9};
    }
}
