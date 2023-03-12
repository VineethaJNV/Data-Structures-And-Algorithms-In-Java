public class PrintSubArrays { // n*(n+1) / 2
                              // continuous part of an array  
    public static void printSubArrays(int arr[]){
     int subCount = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+",");
                }
                subCount++;
                System.out.print(")"+" ");
            }
            System.out.println();
        }
        System.out.println("Total subarrays generated are:"+subCount);

    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};//2, 2,4 2,4,6 2,4,6,8, 2,4,6,8,10
        printSubArrays(arr);
        
    }
}
