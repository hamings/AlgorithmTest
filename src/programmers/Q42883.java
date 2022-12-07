package programmers;

public class Q42883 { // 큰 수 만들기
    public static class Solution {
        public String solution(String number, int k) {
            StringBuilder sb = new StringBuilder();
            int index = 0;
            for(int i = 0;i<number.length()-k;i++){
                char max = '0';
                for(int j = index;j<=k+i;j++){
                    if(max<number.charAt(j)){
                        max = number.charAt(j);
                        index = j+1;
                    }
                }sb.append(max);
            }
            String answer = sb.toString();
            return answer ;
        }
    }

}
