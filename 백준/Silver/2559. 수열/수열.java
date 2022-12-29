import java.util.Scanner;

public class Main { // 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] sum = new int[n-k+1];
        for(int i = 0;i<n-k+1;i++){
            for(int j =i;j<i+k;j++){
                sum[i]+=nums[j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int a : sum){
            max = Math.max(max,a);
        }
        System.out.println(max);
    }
}