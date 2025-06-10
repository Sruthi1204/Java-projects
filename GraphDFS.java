import java.util.*;

public class GraphDFS {
    private int n; // Number of vertices
    private List<List<Integer>> adjList;

    public GraphDFS(int n) {
        this.n = n;
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add edge
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }

    // DFS traversal
    public void dfs(int start) {
        boolean[] visited = new boolean[n];
        System.out.print("DFS Traversal starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Method to print adjacency list
    public void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2},
            {2, 0},
            {2, 3},
            {3, 3}
        };

        GraphDFS graph = new GraphDFS(n);

        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }

        graph.printAdjList();

        graph.dfs(0);
    }
}
