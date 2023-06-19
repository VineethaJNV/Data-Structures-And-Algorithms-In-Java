import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    /*There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array. */
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    // public static int[] findOrder(int numCourses, int[][] prerequisites) {
        
    // }
    public static void calcInDegree(ArrayList<Edge>[]graph, int inDegree[]){
        for(int i = 0 ; i < graph.length; i++){
            for(int j = 0 ; j <graph[i].size(); j++){
                Edge e = graph[i].get(j);
                inDegree[e.dest]++;
            }
        }
        //printing in degree array
        for(int i = 0 ;  i < inDegree.length; i++){
            // System.out.print(inDegree[i]+" ");
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
    // public static void bfs(ArrayList<Edge>graph[]){
    //     boolean vis[] = new boolean[graph.length];
    //     Queue<Integer>q = new LinkedList<>();

    //     q.add(0);
    //     while(! q.isEmpty()){
    //         int curr = q.remove();
    //         if(! vis[curr]){
    //             System.out.print(curr+" ");
    //             vis[curr] = true;

    //             for(int i = 0 ; i < graph[curr].size(); i++){
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }
    public static boolean isCycle(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0 ; i < graph.length; i++){
            if(! vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[]graph, int curr, boolean vis[], boolean stack[]){

        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if((! stack[e.dest]) && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void createGraph(ArrayList<Edge>graph[], int[][]arr){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < arr.length; i++){
            int src = arr[i][1];
            int dest = arr[i][0];

            graph[src].add(new Edge(src, dest));
        }
    }
    public static void main(String[] args) {
        /*
         *                0
         *               / \
         *              1   2
         *              \   /
         *                3
         * 
         */
        int numCourses = 4;
        int prerequisites[][] = {{1,0},{2,0},{3,1},{3,2}};
        ArrayList<Edge> graph[] = new ArrayList[numCourses];
        createGraph(graph, prerequisites);
        // bfs(graph);
        System.out.println(isCycle(graph));
        topSortBFS(graph);
        
    }
}
