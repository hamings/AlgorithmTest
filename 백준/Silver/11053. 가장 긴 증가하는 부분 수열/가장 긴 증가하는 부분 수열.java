import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] dp = new int[size];
        int[] arr = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<size;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0;i<size;i++){
            dp[i]=1;
            for(int j = 0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<dp[j]+1){
                    dp[i]++;
                }
            }
        }
        int answer = 1;
        for(int a:dp){
            answer=Math.max(answer,a);
        }
        System.out.println(answer);

    }

}
