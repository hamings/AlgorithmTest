package programmers;

public class Q12901 { // 2016년
    public static class Solution {
        public String solution(int a, int b) {

            int sum = 0;
            int[] date = {31,29,31,30,31,30,31,31,30,31,30};
            String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
            for(int i = 0;i<a-1;i++){
                sum+=date[i];
            }
            String answer = day[((sum+b)%7)];
            return answer;
        }
    }
}
