import java.util.Scanner;

public class Main { // 구간 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        nums[0]=0;
        int m = sc.nextInt();
        for(int i = 1;i<n+1;i++){
            nums[i]=sc.nextInt()+nums[i-1];
        }
        for(int i=0;i<m;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(nums[end]-nums[start-1]);
            }

        }

    }