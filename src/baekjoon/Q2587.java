package baekjoon;

import java.util.Scanner;

public class Q2587 { //대표값2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if ((nums[i] % 10 == 0) && (nums[i] < 100)) {
                sum += nums[i];
                for (int j = 0; j < i; j++) {
                    if (nums[i] < nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }else {
                System.out.println("잘못된 수입력입니다.");
                i--;
            }
        }
            System.out.println(sum/nums.length);
            System.out.println(nums[2]);

    }
}
