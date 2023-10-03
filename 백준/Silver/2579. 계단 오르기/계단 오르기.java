import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] nums = new int[size+1];
        int[] dp = new int[size+1];

        for(int i = 1;i<nums.length;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }

        dp[1]=nums[1];

        if(size>=2){
            dp[2]=nums[1]+nums[2];
        }

        for(int i=3;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2],(dp[i-3]+nums[i-1]))+nums[i];
        }
        System.out.println(dp[size]);

    }
}
