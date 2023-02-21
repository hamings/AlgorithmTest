
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int m = Integer.parseInt(br.readLine());
        int left = 0;
        int right= nums[n-1];
        while(left<=right) {
            long budget = 0;
            int mid = (left + right) / 2;
            for (int i = 0; i < n; i++) {
                if (nums[i] > mid) {
                    budget += mid;
                } else {
                    budget += nums[i];
                }
            }
            if (budget <= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(right);

    }
    
}