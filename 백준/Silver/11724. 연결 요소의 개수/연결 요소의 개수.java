import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int n;
    static int m;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visit = new boolean[n+1];
        for(int i = 0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            arr[row][col]=1;
            arr[col][row]=1;
        }

        int result = 0;
        for(int i = 1;i<=n;i++){
            if(!visit[i]){
                result++;
                dfs(i);
            }
        }
        System.out.println(result);

    }
    static void dfs(int i){
        visit[i]=true;
        for(int j = 1;j<=n;j++){
            if(arr[i][j]==1&&!visit[j]){
                dfs(j);
            }
        }
    }
}
