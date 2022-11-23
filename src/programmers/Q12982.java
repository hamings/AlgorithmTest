package programmers;

import java.util.Arrays;

public class Q12982 { // 예산
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int a : d){
            sum+=a;
            if(sum<=budget){
                answer++;
            }
        }
        return answer;
    }
}
