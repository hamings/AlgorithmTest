import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static int N, M, start;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        visited = new boolean[N +1];
        recursiveDfs(start);
        sb.append("\n");
        visited = new boolean[N +1];
        bfs(start);
        System.out.println(sb);
    }

    public static void recursiveDfs(int node) {
        visited[node] = true;
        sb.append(node + " ");
        for (int i = 1; i <= N; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                recursiveDfs(i);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> needVisit = new LinkedList<>();
        needVisit.add(node);
        visited[node] = true;
        sb.append(node + " ");
        while (!needVisit.isEmpty()) {
            int visitNode = needVisit.poll();
            for (int i = 1; i <= N; i++) {
                if (graph[visitNode][i] == 1 && !visited[i]) {
                    needVisit.add(i);
                    visited[i] = true;
                    sb.append(i + " ");
                }
            }
        }
    }
}
