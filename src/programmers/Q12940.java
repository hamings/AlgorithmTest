package programmers;

public class Q12940 { // 최대공약수와 최소 공배수
    public static class Solution {
        public int[] solution(int n, int m) {
            int small = Math.min(n,m);
            int[] answer = new int[2];
            for(int i = 1;i<=small;i++){
                if(n%i==0&&m%i==0){
                    answer[0]=i;
                }
            }
            answer[1]=(n*m)/answer[0];
            return answer;
        }
    }
}
