import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] nums = new long[100];
        nums[0]=1;
        nums[1]=1;
        nums[2]=1;
        for(int i = 3;i<100;i++){
            nums[i]=nums[i-3]+nums[i-2];
        }

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(nums[n-1]);
        }


    }
}