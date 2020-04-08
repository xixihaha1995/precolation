/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.Graph;

public class ConnectedComponents {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    private int count;
    private int[] id;

    public ConnectedComponents(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        id = new int[G.V()];


        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }

        }


    }


    public int count() {
        return count;
    }

    public int id(int v) {
        return id[v];
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v))
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }

    }


}
