package programmers;

public class Q77484 { // 로또의 최고 순위와 최저 순위
    public static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int max = 0;
            int min = 0;
            int[] grades = {6,6,5,4,3,2,1};
            for(int i = 0;i<lottos.length;i++){
                if(lottos[i]==0){
                    max++;
                }
                for(int j = 0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        min++;
                        max++;

                    }
                }
            }
            answer[0]=grades[max];
            answer[1]=grades[min];
            return answer;
        }
    }
}
