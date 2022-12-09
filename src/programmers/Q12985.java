package programmers;

public class Q12985 { // 예상 대진표
    public static class Solution {
        public int solution(int n, int a, int b) {
            int answer = 0;
            while(a!=b){
                a=Math.round((float) a/2);
                b=Math.round((float) b/2);
                answer++;
            }
            return answer;
        }
    }
}
