import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][n+1];
        nums[0][1]=Integer.parseInt(br.readLine());
        int max = nums[0][1];
        for(int i=1;i<n;i++){
            st= new StringTokenizer(br.readLine());
            for(int j =1;j<=i+1;j++ ){
                nums[i][j]=Integer.parseInt(st.nextToken())+Math.max(nums[i-1][j-1],nums[i-1][j]);
                max = Math.max(nums[i][j],max);
            }
        }
        System.out.println(max);
    }
}
