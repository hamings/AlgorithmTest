import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[501];
        int[] dp = new int[501];

        int maxIdx = 0;
        for(int i=0;i<count;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a]=b;
            maxIdx = Math.max(maxIdx,a);
        }
        for(int i = 0;i<=maxIdx;i++){
            if(arr[i]!=0){
                dp[i]=1;
            }
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<dp[j]+1){
                    dp[i]++;
                }
            }
        }
        int max =0;
        for(int a:dp){
            max = Math.max(max,a);
        }
        System.out.println(count-max);
    }

}
