import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];

        for(int i = 0;i<n;i++){
            map[i]=br.readLine().toCharArray();
        }
        int existRowCount = 0;
        for(int i = 0;i<n;i++){
            boolean exist = false;
            for(int j = 0;j<m;j++){
                if(map[i][j]=='X'){
                    exist=true;
                }
            }
            if(exist)existRowCount++;
        }
        int existColCount = 0;
        for(int i = 0;i<m;i++){
            boolean exist = false;
            for(int j = 0;j<n;j++){
                if(map[j][i]=='X'){
                    exist=true;
                }
            }
            if(exist)existColCount++;
        }
        System.out.println(Math.max(n-existRowCount,m-existColCount));
    }
}
