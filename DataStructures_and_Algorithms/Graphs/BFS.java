package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Time complexity of BFS is O(V+E), if any one of the terms V or E is far greater than the other, then its O(V) or O(E)
// if we want to represent it in terms of 'n' then its O(n)

/*          [1] -- [3]
 *         /        | \
 *      [0]         |   [5]
 *         \        | /    \
 *          [2] -- [4]      [6]
 */

// Queues are used to implement BFS in graphs and a boolean array to keep track of the visited nodes  

/* Steps:
 * 1. check if the current node is not visited
 * 2. do the operation (for example, printing)
 * 3. flag it as visited
 * 4. add all it's neighbours in the queue
 */

public class BFS {

    static class Edges {
        int src;
        int dest;

        public Edges(int src, int dest) {
            this.dest = dest;
            this.src =src;
        }
    }

    /* Working principle:
     * 1. create Queue and visited[]
     * 2. add the first node of the graph in q
     * 3. while(q is not empty)
     * 3.1 current element = q.remove()
     * 3.2 if(curr is not visited)
     * 3.2.1 do operation on curr
     * 3.2.2 curr is visited
     * 3.2.3 add the neighbours of curr in q using a loop
     */
    
    public static void bfs(ArrayList<Edges>[] graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        // boolean[] visited = {false, false, false, false, false, false, false};   // this is same as:
        boolean[] visited = new boolean[V];
        
        q.offer(0);
        while(!q.isEmpty()) {
            int curr = q.poll();
            if(visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;
                
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edges e = graph[curr].get(i);
                    q.offer(e.dest);
                }
            } 
        }
    }


    public static void bfsModified(ArrayList<Edges>[] graph, boolean[] visited, int startPoint) {
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(startPoint);
        while(!q.isEmpty()) {

            int curr = q.poll();
            if(visited[curr] == false) {

                System.out.print(curr + " ");
                visited[curr] = true;
                
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edges e = graph[curr].get(i);
                    q.offer(e.dest);
                }
            } 
        }
    }


    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edges>[] graph = new ArrayList[V];
        createGraph(graph);
        
        System.out.println("\nAll the nodes present in the graph are:");
        bfs(graph, V);

        /* If the graph is disconnected and has components, implement this using bfsModified:
               boolean[] visited = new boolean[V];
               for(int i = 0; i < V; i++) {
                    
               if(visited[i] == false)
                   bfs(graph, visited, i);
               }
         */
    }


    static void createGraph(ArrayList<Edges>[] graph) {
        for (int i = 0; i < graph.length; i++) 
            graph[i] = new ArrayList<>();
    
        graph[0].add(new Edges(0, 1));
        graph[0].add(new Edges(0, 2));
    
        graph[1].add(new Edges(1, 0));
        graph[1].add(new Edges(1, 3));
    
        graph[2].add(new Edges(2, 0));
        graph[2].add(new Edges(2, 4));
    
        graph[3].add(new Edges(3, 1));
        graph[3].add(new Edges(3, 4));
        graph[3].add(new Edges(3, 5));
    
        graph[4].add(new Edges(4, 2));
        graph[4].add(new Edges(4, 3));
        graph[4].add(new Edges(4, 5));
    
        graph[5].add(new Edges(5, 3));
        graph[5].add(new Edges(5, 4));
        graph[5].add(new Edges(5, 6));
    
        graph[6].add(new Edges(6, 5));
    }
}
