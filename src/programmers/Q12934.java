package programmers;

public class Q12934 { // 정수 제곱근 판별
    public static class Solution {
        public long solution(long n) {
            long answer = Math.sqrt(n)%1==0? (long)Math.pow(Math.sqrt(n)+1,2): -1;
            return answer;
        }
    }
}
