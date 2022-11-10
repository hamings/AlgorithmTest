package programmers;

public interface Q12947 { //하샤드 수
    public static class Solution {
        public boolean solution(int x) {
            int sum = 0;
            boolean answer = true;
            String[] temp = String.valueOf(x).split("");
            for(String s : temp){
                sum+=Integer.parseInt(s);
            }
            if(x%sum!=0){
                answer = false;
            }

            return answer;
        }
    }

}
