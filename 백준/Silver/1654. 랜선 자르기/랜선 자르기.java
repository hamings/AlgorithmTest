import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        long max = 0;
        for(int i = 0;i<n;i++){
            nums[i]=Integer.parseInt(br.readLine());
            if(max<nums[i]){
                max=nums[i];
            }
        }

        long min = 1;
        long mid = 0;
        while(min<=max){
            mid=(min+max)/2;
            long count = 0;
            for(int a : nums){
                count+=a/mid;
            }

            if(count<m){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        System.out.println((min+max)/2);

    }
}