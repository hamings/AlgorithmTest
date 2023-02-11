import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        int[] array = new int[n+1];
        long sum = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                sum+=Math.abs(nums[i]-(i+1));
            }
        }
        System.out.println(sum);
    }
}