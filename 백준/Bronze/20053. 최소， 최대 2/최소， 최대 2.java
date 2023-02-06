import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] nums = new int[size];
            for(int j = 0;j<size;j++){
                nums[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nums);
            sb.append(nums[0]).append(" ").append(nums[size-1]).append("\n");
        }
        System.out.println(sb);
    }
}