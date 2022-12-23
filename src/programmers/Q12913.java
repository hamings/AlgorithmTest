package programmers;

public class Q12913 { // 땅따먹기
    public static class Solution {
        int solution(int[][] land) {
            for(int i = 1;i<land.length;i++) {
                land[i][0]+= Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
                land[i][1]+= Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
                land[i][2]+= Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
                land[i][3]+= Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));
            }
            int answer = 0;
            for(int a : land[land.length-1]){
                answer = Math.max(answer,a);
            }

            return answer;
        }
    }
}
