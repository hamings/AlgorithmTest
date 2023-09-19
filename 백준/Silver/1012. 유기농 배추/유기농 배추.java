import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] ground;

    static boolean[][] visit;
    static int row;
    static int col;
    static int cabbage;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0;i<testCase;i++){
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            cabbage = Integer.parseInt(st.nextToken());
            ground = new int[row][col];
            visit = new boolean[row][col];
            int bug = 0;
            for(int j = 0;j<cabbage;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[x][y]=1;
            }
            for(int x=0;x<row;x++){
                for(int y = 0;y<col;y++){
                    if(ground[x][y]==1&&!visit[x][y]){
                        bug++;
                        dfs(x,y);
                    }
                }
            }
            System.out.println(bug);
        }
    }static void dfs(int x,int y){
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        visit[x][y]=true;

        for(int i = 0;i<4;i++){
            int xn = x+dx[i];
            int yn = y+dy[i];
            if((xn>-1&&xn<row)&&(yn>-1&&yn<col)&&ground[xn][yn]==1&&!visit[xn][yn]){
                dfs(xn,yn);
            }
        }
    }
}
