import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int[][] arr;

    static int node;
    static int line;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        visit = new boolean[node+1];

        for(int i=0;i<line;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            arr[row][col]=1;
            arr[col][row]=1;
        }
        dfs(1);
        System.out.println(count-1);
    }

    private static void dfs(int start) {
        visit[start]=true;
        count++;

        for(int i=0;i<=node;i++){
            if(!visit[i]&&arr[start][i]==1){
                dfs(i);
            }
        }
    }
}
