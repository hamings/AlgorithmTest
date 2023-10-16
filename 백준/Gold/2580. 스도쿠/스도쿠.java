import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map = new int[9][9];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        sudoko(0,0);

    }
    static void sudoko(int row, int col){
        if(col==9){
            sudoko(row+1,0);
            return;
        }
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    sb.append(map[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        if(map[row][col]==0){
            for(int i = 1;i<=9;i++){
                if(check(row,col,i)){
                    map[row][col]=i;
                    sudoko(row,col+1);
                }
            }
            map[row][col]=0;
            return;
        }
        sudoko(row,col+1);

    }
    static boolean check(int row, int col, int value){
        for(int i=0;i<9;i++){
            if(map[row][i]==value){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(map[i][col]==value){
                return false;
            }
        }
        int idxRow = (row/3)*3;
        int idxCol = (col/3)*3;
        for(int i=idxRow;i<idxRow+3;i++){
            for(int j = idxCol;j<idxCol+3;j++){
                if(map[i][j]==value){
                    return false;
                }
            }
        }
        return true;

    }

}
