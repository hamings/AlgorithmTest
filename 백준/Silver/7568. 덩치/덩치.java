import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int t = Integer.parseInt(br.readLine());
        int[][] nums = new int[t][2];
        for(int i = 0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            nums[i][0]=Integer.parseInt(st.nextToken());
            nums[i][1]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<t;i++){
            int rank = 1;
            for(int j = 0;j<t;j++){
                if(i!=j){
                    if(nums[i][0]<nums[j][0]&&nums[i][1]<nums[j][1]){
                        rank++;
                    }
                }
            }sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }
}
