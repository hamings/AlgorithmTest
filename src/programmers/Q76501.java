package programmers;

public class Q76501 { //음양 더하기
    public static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
           for(int i = 0;i<absolutes.length;i++){
               answer += signs[i]==true? absolutes[i] : -absolutes[i];
           }
            return answer;
        }
    }
}
