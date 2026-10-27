import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        Graph graph = new Graph(v);

        System.out.println("Enter edges (source destination weight):");

        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            graph.addEdge(src, dest, weight);
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        graph.dijkstra(source);
        sc.close();
    }

    static class Graph {
        int v;
        List<List<int[]>> adj;

        Graph(int v) {
            this.v = v;
            adj = new ArrayList<>();

            for (int i = 0; i < v; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int src, int dest, int weight) {
            adj.get(src).add(new int[]{dest, weight});
            adj.get(dest).add(new int[]{src, weight});
        }

        void dijkstra(int source) {
            int[] dist = new int[v];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[source] = 0;

            PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

            pq.add(new int[]{source, 0});

            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                int node = curr[0];
                int d = curr[1];

                if (d > dist[node]) continue;

                for (int[] edge : adj.get(node)) {
                    int next = edge[0];
                    int weight = edge[1];

                    if (dist[node] + weight < dist[next]) {
                        dist[next] = dist[node] + weight;
                        pq.add(new int[]{next, dist[next]});
                    }
                }
            }

            System.out.println("Shortest distances from node " + source + ":");

            for (int i = 0; i < v; i++) {
                System.out.println("Node " + i + ": " +
                    (dist[i] == Integer.MAX_VALUE
                        ? "Unreachable" : dist[i]));
            }
        }
    }
}