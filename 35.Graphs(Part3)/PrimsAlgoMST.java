import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgoMST {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int V;
        int cost;

        public Pair(int V, int cost){
            this.V = V;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static int findMSTUsingPrim(ArrayList<Edge>[]graph, int start){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        pq.add(new Pair(start, 0));
        int cost = 0;

        while(! pq.isEmpty()){
            Pair curr = pq.remove();
            if(! vis[curr.V]){
                vis[curr.V] = true;
                cost += curr.cost;
                result.add(curr.V);
                for(int i = 0 ; i < graph[curr.V].size(); i++){
                    Edge e = graph[curr.V].get(i);
                    
                    
                    pq.add(new Pair(e.dest, e.wt));

                }
            }
        }
        System.out.println(result);
        return cost;

    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(1, 1, 40));

    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(findMSTUsingPrim(graph, 0));

    }
}
