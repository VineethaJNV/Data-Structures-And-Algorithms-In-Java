public class MergeTwoSortedArrays {

	public static void printMerged(int arr1[], int arr2[], int result[]){
		int x = 0, y = 0, i = 0;
		


		while(x < arr1.length && y < arr2.length){
			if(arr1[x] < arr2[y]){
				result[i] = arr1[x];
				i++;
				x++;
			}else{
				result[i] = arr2[y];
				i++;
				y++;
			}

		}
		while(x < arr1.length){
			result[i] = arr1[x];
				i++;
				x++;
		}
		while(y < arr2.length){
			result[i] = arr2[y];
				i++;
				y++;
		}
		return;
	}

    public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		int arr2[] = {1,3,5,7,9};
		int result[] = new int[arr.length+arr2.length];
		
		printMerged(arr, arr2, result);

		for(int i = 0;  i< result.length; i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
        
    }
}
