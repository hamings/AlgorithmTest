import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] nums = new long[1000000];
        nums[0]=1;
        nums[1]=2;
        for(int i = 2;i<n;i++){
            nums[i]=(nums[i-2]+nums[i-1])%15746;
        }
        System.out.println(nums[n-1]);

    }
}