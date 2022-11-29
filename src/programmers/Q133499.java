package programmers;

public class Q133499 { // 옹알이(2)
    public static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            for(String str : babbling){
                str = str.replace("aya","1");
                str = str.replace("ye","2");
                str = str.replace("woo","3");
                str = str.replace("ma","4");
                if(str.matches("^[0-9]+$")&&!str.contains("11")&&!str.contains("22")&&!str.contains("33")&&!str.contains("44")){
                    answer++;
                }
            }
            return answer;
        }
    }

}
