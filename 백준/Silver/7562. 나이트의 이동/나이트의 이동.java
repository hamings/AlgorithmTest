import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visit;
    static int[][] arr;
    static int size;

    static int startX,startY,endX,endY;
    static int[] dx = {-2,-1,1,2,2,1,-1,-2};
    static int[] dy = {1,2,2,1,-1,-2,-2,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0;i<count;i++){
            size = Integer.parseInt(br.readLine());
            arr= new int[size][size];
            visit = new boolean[size][size];
            StringTokenizer st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            visit[startX][startY]=true;
            bfs(startX,startY);
            System.out.println(arr[endX][endY]);

        }

    }
    static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        loop:
        while(!queue.isEmpty()){
            Point point = queue.poll();
            for(int i=0;i<8;i++){
                int nextX = point.x+dx[i];
                int nextY = point.y+dy[i];
                if((nextX>-1&&nextX<size)&&(nextY>-1&&nextY<size)&&!visit[nextX][nextY]){
                    queue.add(new Point(nextX,nextY));
                    arr[nextX][nextY]= arr[point.x][point.y]+1;
                    visit[nextX][nextY]=true;
                    if(nextX==endX&&nextY==endY){
                        break loop;
                    }
                }
            }
        }
    }
}
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}