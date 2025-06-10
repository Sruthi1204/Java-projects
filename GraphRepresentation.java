import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {
        // Vertices and mapping
        char[] vertices = {'A', 'B', 'C', 'D'};
        int n = vertices.length;

        // Initialize adjacency matrix
        int[][] adjMatrix = new int[n][n];

        // Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Define edges (from -> to)
        int[][] edges = {
            {0, 1}, // A -> B
            {0, 2}, // A -> C
            {1, 3}, // B -> D
            {2, 3}  // C -> D
        };

        // Build adjacency matrix and list
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjMatrix[from][to] = 1;
            adjList.get(from).add(to);
        }

        // Print adjacency matrix
        System.out.println("Adjacency Matrix:");
        System.out.print("  ");
        for (char v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print adjacency list
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(vertices[neighbor] + " ");
            }
            System.out.println();
        }
    }
}
