package programmers;

public class Q12932 { // 자연수 뒤집어 배열 만들기
    public static class Solution {
        public int[] solution(long n) {
            String[] strings = String.valueOf(n).split("");
            int[] answer = new int[strings.length];
            int index = 0;
            for(int i = strings.length-1;i>=0;i--){
                answer[index++] = Integer.parseInt(strings[i]);
            }
            return answer;
        }
    }
}
