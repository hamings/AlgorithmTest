package programmers;

public class Q134240 { //푸드 파이트 대회
    public static class Solution {
        public String solution(int[] food) {
            String left = "";
            for(int i = 1;i<food.length;i++){
                for(int j = 0;j<food[i]/2;j++){
                    left+=Integer.toString(i);
                }
            }
            String right = "";
            for(int i=left.length()-1;i>=0;i--){
                right+= left.charAt(i);
            }

            String answer = left + 0 +right;
            return answer;
        }
    }

}
