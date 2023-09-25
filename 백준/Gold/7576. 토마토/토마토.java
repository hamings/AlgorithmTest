import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int row;
    static int col;
    static int[][] arr;
    static Queue<Position> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        arr = new int[row][col];
        int day=0;

        int zero=0;
        for(int i = 0;i<row;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<col;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]==0){
                    zero++;
                }

            }
        }if(zero==0){
            System.out.println(0);
            return;
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(arr[i][j]==1){
                    queue.add(new Position(i,j));
                }
            }
        }
        bfs();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(arr[i][j]==0){
                    System.out.println(-1);
                    return;
                }else{
                    day=Math.max(day,arr[i][j]);
                }
            }
        }
        System.out.println(day-1);



    }
    static void bfs(){
        int[] dx={0,0,-1,1};
        int[] dy={1,-1,0,0};


        while(!queue.isEmpty()){
            Position position = queue.poll();
            for(int i = 0;i<4;i++){
                int nextX = position.x+dx[i];
                int nextY = position.y+dy[i];
                if((nextX>-1&&nextX<row)&&(nextY>-1&&nextY<col)&&arr[nextX][nextY]==0){
                    arr[nextX][nextY]=arr[position.x][position.y]+1;
                    queue.add(new Position(nextX,nextY));

                }
            }
        }

    }

}


class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}