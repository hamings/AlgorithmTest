package programmers;

public class Q77884 {
    public static class Solution { // 약수의 개수와 덧셈
        public int solution(int left, int right) {
            int answer = 0;
            for(int i = left;i<(right+1);i++){
                int count=0;
                for(int j = 1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count%2==0){
                    answer+=i;
                }else{
                    answer-=i;
                }
            }
            return answer;
        }
    }
}

