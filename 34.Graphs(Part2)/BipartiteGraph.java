import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[]graph, int src){
        int color[] = new int[graph.length];

        for(int i =  0 ; i < graph.length; i++){//fill the color with -1 signifying no color
            color[i] = -1;
        }

        Queue<Integer>q = new LinkedList<>();//queue for BFS traversal => FIFO

        for(int i = 0 ; i < graph.length; i++){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;//yellow
                while(! q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0 ; j < graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(color[e.dest] == -1){
                            int nextCol = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        }else if(color[e.dest] == color[curr]){
                            return false; //Not bipartitie
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        } 
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(4, 4));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }
    public static void main(String[] args) {
        /*A graph, which has no cycle, is always a bipartite graph
         *               0
         *              / \
         *             /   \
         *            1     2
         *            \     /
         *             3---4
         * Ans : FALSE => Above graph is not bipartite
         */
        int V = 5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph, 0));
    }
}
