package baekjoon;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        char[] nums = sc.next().toCharArray();
        int total = 0;

        for(int i = 0;i<count;i++){
            total+=Character.getNumericValue(nums[i]);
        }
        System.out.println(total);
    }
}