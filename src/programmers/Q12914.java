package programmers;

public class Q12914 { // 멀리 뛰기
    public static class Solution {
        public long solution(int n) {
            int[] nums = new int[2000];
            nums[0]=1;
            nums[1]=2;
            for(int i = 2;i<n;i++){
                nums[i]= (nums[i-1]+nums[i-2])%1234567;
            }
            long answer = nums[n-1];

            return answer;
        }
    }
}
