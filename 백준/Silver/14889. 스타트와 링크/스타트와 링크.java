import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] nums;
    static boolean[] flag;
    static int n;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n][n];
        flag = new boolean[n];
        StringTokenizer st;
        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++){
                nums[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(min);

    }
    public static void dfs(int depth, int count){
        if(count==n/2){
            diff();
            return;
        }for(int i = depth;i<n;i++){
                if(!flag[i]){
                    flag[i] = true;
                    dfs(i+1,count+1);
                    flag[i]=false;

                }
            }
        }
    public static void diff(){
        int start = 0;
        int link = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(flag[i]&&flag[j]){
                    start+=nums[i][j];
                    start+=nums[j][i];
                }else if(!flag[i]&&!flag[j]){
                    link+=nums[i][j];
                    link+=nums[j][i];
                }
            }
        }
        int gap = Math.abs(start-link);
        if(gap==0){
            System.out.println(gap);
            System.exit(0);
        }
        min = Math.min(min,gap);
    }
}