package Whatever;

import java.util.*;
class Super {
    public void method() {
        System.out.println("I am in class Super");
    }
}

class Sub extends Super {
    public void method() {
        System.out.println("I am in class Sub");
    }
}

class Arnab {

    static class Edges {
        int src;
        int dest;

        public Edges(int src, int dest) {
            this.dest = dest;
            this.src =src;
        }
    }

    public static void bfs(ArrayList< ArrayList<Edges> > graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        
        q.offer(0);
        while(!q.isEmpty()) {
            int curr = q.poll();
            if(visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;
                
                for (int i = 0; i < graph.get(curr).size(); i++) {
                    Edges e = graph.get(curr).get(i);
                    q.offer(e.dest);
                }
            } 
        }
    }

    public static void dfs(ArrayList< ArrayList<Edges> >  graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edges e = graph.get(curr).get(i);

            if(visited[e.dest] == false)
                dfs(graph, e.dest, visited);
        }

    }
    public static String common_string(String str1, String str2, String str3) {
        String str4 = new String();

        for (int i = 0;; i++) {
            if (str1.charAt(i) == str2.charAt(i) && str2.charAt(i) == str3.charAt(i)) {
                str4 = (str4 + str2.charAt(i));
            } else
                return str4;
        }
        
    }

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "arndfhjklbb";
        String str3 = "arndfhjklab";
        System.out.println(common_string(str1, str2, str3));

}
}