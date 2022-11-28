package programmers;

public class Q12903 { // 가운데 글자 가져오기
    public static class Solution {
        public String solution(String s) {
            int a = s.length()/2;
            String answer = "";
            answer = s.length()%2==0? s.substring(a-1,a+1):s.substring(a,a+1);
            return answer;
        }
    }
}
