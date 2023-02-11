import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        Integer[] nums = new Integer[n];
        for(int i = 0;i<n;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums,Collections.reverseOrder());
        int count = 0;
        for(int i = 0;i<n;i++){
            if(total==0){
                break;
            }
            if(total/nums[i]!=0){
                count+=total/nums[i];
                total=total%nums[i];
            }

        }
        System.out.println(count);

    }
}