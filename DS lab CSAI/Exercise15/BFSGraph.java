import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BFSGraph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read student names
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] students = new String[n];

        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }

        // Step 2: Create the graph
        int[][] graph = new int[n][n];

        System.out.print("Enter number of friendships: ");
        int edges = sc.nextInt();

        // Step 3: Read friendship connections
        System.out.println(
            "Enter friendship pairs using vertex numbers:"
        );

        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        // Step 4: Read starting student
        System.out.print(
            "Enter starting student number (0 to "
            + (n - 1) + "): "
        );
        int start = sc.nextInt();

        // Step 5: Create visited array and queue
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal:");

        // Step 6: Perform BFS
        while (!queue.isEmpty()) {

            int current = queue.remove();

            System.out.print(students[current] + " ");

            for (int i = 0; i < n; i++) {

                if (graph[current][i] == 1
                        && !visited[i]) {

                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println();

        sc.close();
    }
}
