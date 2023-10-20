import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] tName = new int[count];
        int[][] arr = new int[count][20];
        for(int i = 0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            tName[i]=Integer.parseInt(st.nextToken());
            int answer = 0;
            for(int j = 0;j<20;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                for(int k=j-1;k>=0;k--){
                    if(arr[i][k]>arr[i][j]){
                        answer++;
                    }
                }

            }System.out.println(tName[i]+" "+answer);
        }

    }
}
