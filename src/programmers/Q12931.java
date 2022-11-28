package programmers;

public class Q12931 { // 자릿수 더하기
    public static class Solution {
        public int solution(int n) {
            String[] strs = String.valueOf(n).split("");
            int answer = 0;
            for(String s : strs){
                answer+=Integer.parseInt(s);
            }

            return answer;
        }
    }
}
