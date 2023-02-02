import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        st = new StringTokenizer(bufferedReader.readLine()," ");

        for(int i = 0;i<n;i++){
            nums[i]= Integer.parseInt(st.nextToken());
        }
        int max = 0;
        loop:
        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==m){
                        max=sum;
                        break loop;
                    }
                    if(sum<m){
                        max = Math.max(max,sum);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
