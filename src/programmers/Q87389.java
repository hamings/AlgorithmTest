package programmers;

public class Q87389 { // 나머지가 1이 되는 수 찾기
    public static class Solution {
        public int solution(int n) {
            int answer = n-1;
            for(int i = 2;i<answer;i++){
                if(answer%i==0){
                    answer = i;
                }
            }
            return answer;
        }
    }
}
