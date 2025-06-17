import java.util.*;
public class BFSExample {
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : graph.getOrDefault(vertex, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(2));
        System.out.println("BFS traversal starting from node 1:");
        bfs(graph, 1);
    }
}
