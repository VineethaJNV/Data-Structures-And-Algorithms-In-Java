import java.util.*;
class Result {
	static class Node{
		int data;
		Node right;
		Node left;
		public Node(int data){
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}

	/*
	 * Complete the 'count_children' function below.
	 * 
	 * The function is expected to return an LONG INTEGER ARRAY.
	 * The function accepts LONG INTEGER N as parameter.
	 * 
	 */
	public static ArrayList<Long>nums = new ArrayList<>();
    public static HashMap<Long, Long>map = new HashMap<>();
	public static void generateList(long N){
        // Long one = new Long(1);
		if(N == 1){
			nums.add(N);
            if(map.containsKey(N)){
                map.put(N, map.get(N)+1);
            }else{
                map.put(N, 1L);
            }
            
			return;
		}
        if(N < 1){
            return;
        }
		nums.add(N);
        if(map.containsKey(N)){
			map.put(N, map.get(N)+1);
		}else{
			map.put(N, 1L);
		}
		// Node root = new Node(N);
		// root.left = new Node(N-1);
		// root.left = newNode()
		generateList(N-2);
		generateList(N-1);
        return;
		

	}
	public static List<Long> count_children(long N) {
		// Write your code here
		generateList(N);
		System.out.println(nums);
        List<Long>result = new ArrayList<>();
		
		for(Long value : map.values()){
			result.add(value);
		}
		Collections.sort(result, Comparator.reverseOrder());
        System.out.println(result);
		return new ArrayList<Long>();

		
		
	}
    public static void main(String[] args) {
        int N = 4;
        count_children(N);
    }
}