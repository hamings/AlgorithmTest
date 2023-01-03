import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[30];

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<28;i++){
            int a = sc.nextInt();
            nums[a-1]=1;
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=1){
                System.out.println(i+1);
            }
        }
    }
}
