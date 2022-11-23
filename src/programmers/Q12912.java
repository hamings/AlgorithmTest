package programmers;

public class Q12912 { // 두 정수 사이의 합
    public static class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
            } else {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
            }
            return answer;
        }
    }
}