public class Sample {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = new int[arr.length];

        arr2 = arr;

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.println();
        arr[1] = 100;

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] +" ");
        }
    }
}
