import java.util.ArrayList;

public class DFS {
    public void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storedfs) {
        storedfs.add(node);
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, storedfs);
            }
        }
    }

    public ArrayList<Integer> dfsofGraph(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)

    {
        ArrayList<Integer> storedfs = new ArrayList<>();
        boolean vis[] = new boolean[V + 1];
        for (int i = 1; i <= V; i++) {
            if (vis[i] == false) {
                dfs(i, vis, adj, storedfs);
            }
        }
        return storedfs;
    }
}
