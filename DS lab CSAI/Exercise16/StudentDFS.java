import java.util.Scanner;

class StudentDFS{
    static int[][] graph;
    static boolean[] visited;
    static String[] students;
    static int n;

    static void dfs(int student) {
        visited[student] = true;
        System.out.print(students[student] + " ");

        for (int i = 0; i < n; i++) {
            if (graph[student][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read student names
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new String[n];
        graph = new int[n][n];
        visited = new boolean[n];

        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }
        System.out.print("Enter number of friendships: ");
        int edges = sc.nextInt();

        System.out.println("Enter friendship pairs using student numbers :");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        System.out.println("\nStudent numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "-" + students[i]);
        }

        System.out.print(
            "\nEnter starting student number:");
        int start = sc.nextInt();

        System.out.println("\nDFS connection exploration:");
        dfs(start);

        sc.close();
    }
}