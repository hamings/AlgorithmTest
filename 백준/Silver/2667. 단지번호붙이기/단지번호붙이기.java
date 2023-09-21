import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int[][] ground;
    static int size;
    static int count;
    static int number =0;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        ground= new int[size][size];
        visit = new boolean[size][size];

        for(int i = 0;i<size;i++){
            String[] strings = br.readLine().split("");
            for(int j=0;j< strings.length;j++){
                ground[i][j]=Integer.parseInt(strings[j]);
            }

        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(ground[i][j]==1&&!visit[i][j]){
                    count=0;
                    number++;
                    dfs(i,j);
                    arrayList.add(count);
                }
            }



        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(int a:arrayList){
            System.out.println(a);
        }

    }static void dfs(int i,int j){
        visit[i][j]=true;
        ground[i][j]=number;
        count++;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        for(int a = 0;a<4;a++){
            int x = i+dx[a];
            int y = j+dy[a];
            if((x>-1&&x<size)&&(y>-1&&y<size)&&ground[x][y]==1&&!visit[x][y]){
                dfs(x,y);
            }
        }
    }
}
