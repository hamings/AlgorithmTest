package programmers;

public class Q12900 { // 2 x n 타일링
    public static class Solution {
        public int solution(int n) {
            int[] arrays = new int[n];
            arrays[0] = 1;
            arrays[1] = 2;

            for(int i = 2;i<n;i++){
                arrays[i]=(arrays[i-1]+arrays[i-2])%1000000007;
            }

            int answer = arrays[n-1];

            return answer;
        }
    }

}
