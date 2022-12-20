package programmers;

public class Q131127 { // 할인 행사
    public static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            for(int i = 0;i<discount.length-9;i++){
                int[] copy = number.clone();
                for(int j = i;j<i+10;j++){
                    for(int k = 0;k<want.length;k++){
                        if(discount[j].equals(want[k])){
                            copy[k]--;
                        }
                    }

                }
                int check = 0;
                for(int a : copy){
                    if(a==0){
                        check++;
                    }
                }
                if(number.length==check){
                    answer++;
                }
            }

            return answer;
        }
    }

}
