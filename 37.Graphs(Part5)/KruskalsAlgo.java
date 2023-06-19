import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i = 0 ;i < par.length; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(par[x] == x){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    public static int kruskalsMST(ArrayList<Edge>graph){
        init();
        Collections.sort(graph); //O(E logE)
        // for(int i = 0 ; i < graph.size(); i++){
        //     System.out.println(graph.get(i).wt);
        // }
        int mstCost = 0;
        // int count = 0;
        for(int i = 0 ; i < graph.size() - 1; i++){ //O(V)
            Edge e = graph.get(i);
            //(src, dest, wt);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(e.src, e.dest);
                mstCost += e.wt;
            }
        }
        return mstCost;
    }
    public static void createGraph(ArrayList<Edge>graph){
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(3, 2, 50));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
    }

    public static void main(String[] args) {
        ArrayList<Edge>graph = new ArrayList<>();
        createGraph(graph);
        System.out.println(kruskalsMST(graph));
    }
}
