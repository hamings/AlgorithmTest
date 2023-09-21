import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int row;
    static int col;
    static boolean[][] visit;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        arr = new int[row][col];
        visit = new boolean[row][col];

        for(int i = 0;i<row;i++){
            String[] strings = br.readLine().split("");
            for(int j = 0;j<col;j++){
                arr[i][j]=Integer.parseInt(strings[j]);
            }
        }
        bfs(0,0);
        System.out.println(arr[row-1][col-1]);

    }
    static void bfs(int x, int y){
        Queue<Spot> queue = new LinkedList<>();
        queue.add(new Spot(x,y));

        while(!queue.isEmpty()){
            Spot spot = queue.poll();
            for(int i = 0;i<4;i++){
                int nextX = spot.x+dx[i];
                int nextY = spot.y+dy[i];
                if((nextX>-1&&nextX<row)&&(nextY>-1&&nextY<col)&&!visit[nextX][nextY]&&arr[nextX][nextY]==1){
                    arr[nextX][nextY]=arr[spot.x][spot.y]+1;
                    visit[nextX][nextY]=true;
                     queue.add(new Spot(nextX,nextY));
                }
            }
        }


    }
}
class Spot{
    int x;
    int y;
    Spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
