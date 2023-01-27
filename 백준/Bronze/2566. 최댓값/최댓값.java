import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        int row=0;
        int column = 0;
        int[][] arrays = new int[9][9];
        for(int i = 0;i<9;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arrays[i][j]=Integer.parseInt(st.nextToken());
                if(max<=arrays[i][j]){
                    max=arrays[i][j];
                    row=i+1;
                    column=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+column);
    }
}