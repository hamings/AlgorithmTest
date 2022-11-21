package programmers;

public class Q12918 { // 문자열 다루기 기본
    public static class Solution {
        public boolean solution(String s) {
            boolean answer = false;
            if(s.length()==4||s.length()==6){
                answer = s.matches("^[0-9]+$");
                }
            return answer;
            }
        }
}
