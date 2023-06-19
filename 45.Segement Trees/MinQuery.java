public class MinQuery {
    static int tree[];
    public static void init(int n){
        tree = new int[4 * n];
    }

    public static void buildSt(int arr[], int i, int si, int sj){
        if( si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        buildSt(arr, 2*i+ 1, si, mid);
        buildSt(arr, 2*i+2, mid+1, sj);
        tree[i] = Math.min(tree[2*i+1], tree[2*i+2]);
    }
    public static int getMinUtil(int i, int si, int sj, int qi, int qj){
        if(si > qj || sj < qi){ //no overlap
            return Integer.MAX_VALUE;
        }else if(si >= qi && sj <= qj){
            return tree[i];
        }else{//partial overlap
            int mid = (si+sj)/2;
            int leftAns = getMinUtil(2*i+1, si, mid, qi, qj);
            int rightAns = getMinUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.min(rightAns, leftAns);
        }
    }
    public static int getMin(int arr[], int qi, int qj){
        return getMinUtil(0, 0, arr.length-1, qi, qj);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx < si || idx > sj){
            return;
        }
        if(si == sj){
            tree[i] = newVal;
        }
        if(si != sj){
            tree[i] = Math.min(tree[i], newVal);
            int mid = (si+sj) / 2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }
    }
    public static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        arr[idx] = newVal; //Updated in array
        updateUtil(0, 0, n-1, idx, newVal); //Updation in segment tree
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        init(arr.length);
        buildSt(arr, 0, 0, arr.length-1);
        // for(int i = 0 ; i < tree.length; i++){
        //     System.out.print(tree[i]+" ");
        // }
        // System.out.println();
        System.out.println(getMin(arr, 2, 5));
        update(arr, 2, 1);
        System.out.println(getMin(arr, 2, 5));
    }
}
