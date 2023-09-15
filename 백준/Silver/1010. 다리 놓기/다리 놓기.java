import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dp = new int[31][31];

        for(int i = 1;i<31;i++){
            dp[i][i]=1 ;
            dp[i][0]=1;
        }

        for(int i = 2;i<31;i++){
            for(int j=1;j<i;j++){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(dp[m][n]);

        }

    }

}
