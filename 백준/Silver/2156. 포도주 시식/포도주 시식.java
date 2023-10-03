import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[] arr = new int[length+1];
        int[] dp = new int[length+1];

        for(int i = 1;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        dp[1]=arr[1];

        if(length>=2){
            dp[2]=arr[1]+arr[2];
        }
        for(int i = 3;i<dp.length;i++){
            dp[i]=Math.max((Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i]),dp[i-1]);

        }
        System.out.println(dp[length]);



    }
}
