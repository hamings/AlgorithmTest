import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[1000001];
        nums[1]=0;
        nums[2]=1;
        nums[3]=1;
        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=4;i<=n;i++){
            if(nums[i]==0){
                nums[i]++;
                if(i%6==0){
                    nums[i]+=Math.min(Math.min(nums[i/3],nums[i/2]),nums[i-1]);
                }
                else if(i%3==0){
                    nums[i]+=Math.min(nums[i/3],nums[i-1]);
                }else if(i%2==0){
                    nums[i]+=Math.min(nums[i/2],nums[i-1]);
                }else{
                    nums[i]+=nums[i-1];
                }
            }
        }
        System.out.println(nums[n]);

    }
}