import java.util.*;

class Graph {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    Graph(int n) {
        adj = new LinkedList[n + 10];
        visited = new boolean[n + 10];
        for (int i = 0; i <= n; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addNode(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    void dfs(int root) {
        visited[root] = true;
        Iterator<Integer> it = adj[root].listIterator();
        while (it.hasNext()) {
            int v = it.next();
            if (visited[v] == true) continue;
            dfs(v);
        }
    }

    int unreachable(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) cnt++;
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int node = input.nextInt(), edges = input.nextInt();
        Graph g = new Graph(node);
        for (int i = 0; i < edges; i++) {
            int u = input.nextInt(), v = input.nextInt();
            g.addNode(u, v);
        }
        int root = input.nextInt();
        g.dfs(root);
        int res = g.unreachable(node);
        System.out.println(res);
        input.close();
    }
}
