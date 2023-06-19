import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgoSCC{
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void KosarajuAlgo(ArrayList<Edge>graph[], int edges[][]){
        createGraph(graph, edges);
        //Step 1 =>Get the topological sort in stack
        Stack<Integer>s = new Stack<>();
        topSort(graph, s);

        //Step 2 => Transpose the given graph
        ArrayList<Edge>[]transGraph = new ArrayList[edges.length];
        createTansposeGraph(transGraph, edges);
        //Step 3 => Peform DFS on the transposed graph to get strongly connected component
        dfs(transGraph, s);
    }
    public static Stack<Integer> topSort(ArrayList<Edge>[]graph,Stack<Integer>s){
        boolean vis[] = new boolean[graph.length];
        
        for(int i = 0 ; i < graph.length; i++){
            if(! vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
       return s;
    }
    public static void topSortUtil(ArrayList<Edge>[]graph, int curr, boolean vis[], Stack<Integer>s){
        // System.out.print(curr+" ");
        vis[curr] = true;

        for(int i = 0 ; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(! vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
        // System.out.println();
    }
    public static void createTansposeGraph(ArrayList<Edge>transGraph[], int edges[][]){
        int transEdges[][] = new int[edges.length][edges[0].length];

        for(int i = 0 ; i < edges.length; i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            transEdges[i][0] = dest;
            transEdges[i][1] = src;
        }
        
        createGraph(transGraph, transEdges);
    }
    public static void createGraph(ArrayList<Edge>[]graph, int edges[][]){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < graph.length; i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            graph[src].add(new Edge(src, dest));
        }
    }
    public static void dfs(ArrayList<Edge>[]graph, Stack<Integer>s){
        boolean vis[] = new boolean[graph.length];
        while(! s.isEmpty()){
            int curr = s.pop();
            if(! vis[curr]){
                System.out.print("SCC => ");
                dfsUtil(graph, curr, vis);
                System.out.println();
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[]graph, int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i = 0 ; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(! vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0,2},{0,3},{2,1},{1,0},{3,4}};
        ArrayList<Edge>[]graph = new ArrayList[edges.length];
        KosarajuAlgo(graph, edges);
        
    }
}