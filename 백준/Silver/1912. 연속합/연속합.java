import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        long[] sum = new long[n];
        sum[0]=num[0];
        long max=num[0];
        for(int i = 1;i<n;i++){
            sum[i]=Math.max(num[i],sum[i-1]+num[i]);
            max = Math.max(sum[i],max);
        }
        System.out.println(max);
    }
}