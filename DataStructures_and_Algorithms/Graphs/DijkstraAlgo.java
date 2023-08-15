package Graphs;

import java.util.*;

public class DijkstraAlgo {
    private static final int INF = Integer.MAX_VALUE;

    static class Edge {
        int src, dest, wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Node implements Comparable<Node> {
        int num;
        int dist;

        public Node(int num, int dist) {
            this.num = num;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node n) {
            return this.dist - n.dist;
        }
    }

    static int[] dijkstra(ArrayList<ArrayList<Edge>> graph, int src) {

        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] visited = new boolean[graph.size()];

        int[] dist = new int[graph.size()];
        for (int i = 0; i < dist.length; i++) {
            if (i != src)
                dist[i] = INF;
        }

        queue.offer(new Node(src, 0));
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (!visited[curr.num]) {
                visited[curr.num] = true;

                for (int i = 0; i < graph.get(curr.num).size(); i++) {
                    Edge e = graph.get(curr.num).get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        queue.offer(new Node(v, dist[v]));
                    }
                }
            }
        }
        return dist;
    }

    
    static void createGraph(ArrayList<ArrayList<Edge>> graph) {
        for (int i = 0; i < graph.size(); i++) 
            graph.add(new ArrayList<>());
        
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));
        graph.get(1).add(new Edge(1, 3, 7));
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(2).add(new Edge(2, 4, 3));
        graph.get(3).add(new Edge(3, 5, 1));
        graph.get(4).add(new Edge(4, 3, 2));
        graph.get(4).add(new Edge(4, 5, 5));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(V);
        createGraph(graph);

        System.out.println(Arrays.toString(dijkstra(graph, 0)));
    }
}
