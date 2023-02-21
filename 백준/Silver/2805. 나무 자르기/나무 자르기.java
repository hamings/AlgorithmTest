import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums[n-1];
        while(start<=end){
            long total = 0;
            int mid = (start+end)/2;
            for(int i = 0;i<n;i++){
                if(nums[i]>mid){
                    total+=nums[i]-mid;
                }
            }
            if(total<m){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        System.out.println(end);
    }
}