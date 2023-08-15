package Graphs;
import java.util.*;

public class AllPaths {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void printPath(ArrayList<Edge>[] graph, boolean[] visited, int curr, int target, String path) {
        if(curr == target) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]) {
                visited[curr] = true;
                printPath(graph, visited, e.dest, target, path + e.dest + " ");
                visited[curr] = false;
            }
        }
    }


/*          [1] -- [3]
 *         /        | \
 *      [0]         |   [5]
 *         \        | /    \
 *          [2] -- [4]      [6]
 */

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0, target = 5;
        System.out.println("\nAll paths from " + src + " to " + target + " are: ");
        printPath(graph, new boolean[V], src, target, "0 ");

    }
 


    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) 
            graph[i] = new ArrayList<>();
    
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
    
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
    
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
    
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
    
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
    
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
    
        graph[6].add(new Edge(6, 5));
    }
}