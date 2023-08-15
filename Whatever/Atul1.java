package Whatever;

import java.util.*;

public class Atul1 {
    private int[][] graph;
    private int startNode;
    private int endNode;
    private String[] weights;
    
    public Atul1(int[][] graph, int startNode, int endNode, String[] weights) {
        this.graph = graph;
        this.startNode = startNode;
        this.endNode = endNode;
        this.weights = weights;
    }
    
    public void findShortestPath() {
        
        Map<String, Map<Integer, Integer>> shortestPaths = new HashMap<>();
        for (String weight : weights) {
            shortestPaths.put(weight, dijkstra(weight));
        }
        
    
        int minTime = shortestPaths.get("time").get(endNode);
        int minCost = shortestPaths.get("cost").get(endNode);
        int minCarbon = shortestPaths.get("carbon").get(endNode);
        
    
        int totalTax = 0;
        int maxProfit = Integer.MIN_VALUE;
        int[] path = new int[graph.length];
        int pathIndex = 0;
        int currentNode = endNode;
        while (currentNode != startNode) {
            path[pathIndex++] = currentNode;
            int parent = -1;
            for (int i = 0; i < graph.length; i++) {
                if (graph[i][currentNode] != 0) {
                    if (parent == -1 || shortestPaths.get("tax").get(i) < shortestPaths.get("tax").get(parent)) {
                        parent = i;
                    }
                }
            }
            totalTax += graph[parent][currentNode];
            int profit = graph[parent][currentNode] - shortestPaths.get("time").get(parent) - shortestPaths.get("cost").get(parent) - shortestPaths.get("carbon").get(parent) - shortestPaths.get("tax").get(parent);
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            currentNode = parent;
        }
        path[pathIndex++] = currentNode;
        System.out.println("Minimum time: " + minTime);
        System.out.println("Minimum cost: " + minCost);
        System.out.println("Minimum carbon: " + minCarbon);
        System.out.println("Total tax: " + totalTax);
        System.out.println("Maximize profit: " + maxProfit);
        System.out.println("Shortest path: " + Arrays.toString(Arrays.copyOfRange(path, 0, pathIndex)));
    }
    
    public Map<Integer, Integer> dijkstra(String weight) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        Map<Integer, Integer> distances = new HashMap<>();
        heap.offer(new int[] {startNode, 0});
        while (!heap.isEmpty()) {
            int[] node = heap.poll();
            int id = node[0];
            int dist = node[1];
            if (distances.containsKey(id)) {
                continue;
            }
            distances.put(id, dist);
            if (id == endNode) {
                break;
            }
            for (int i = 0; i < graph.length; i++) {
                if (graph[id][i] != 0) {
                    int weightValue = 0;
                    switch (weight) {
                        case "time":
                            weightValue = graph[id][i];
                            break;
                        case "cost":
                            weightValue = graph[id][i];
                            break;
                        
                    }
                }
            }
        }
        return distances;
    }
}