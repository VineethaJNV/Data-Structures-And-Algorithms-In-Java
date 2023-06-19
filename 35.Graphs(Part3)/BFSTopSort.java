import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BFSTopSort {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void calcInDegree(ArrayList<Edge>[]graph, int inDegree[]){
        for(int i = 0 ; i < graph.length; i++){
            for(int j = 0 ; j <graph[i].size(); j++){
                Edge e = graph[i].get(j);
                inDegree[e.dest]++;
            }
        }
        //printing in degree array
        for(int i = 0 ;  i < inDegree.length; i++){
            System.out.print(inDegree[i]+" ");
        }
        System.out.println();
    }
    public static void topSortBFS(ArrayList<Edge>[]graph){
        int inDegree[] = new int[graph.length];
        calcInDegree(graph, inDegree);

        Queue<Integer> q = new LinkedList<>();

        //Add the vertices with 0 indegree into the queue
        for(int i = 0 ; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }

        while(! q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i = 0 ;  i< graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if(inDegree[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        topSortBFS(graph);
    }
}
