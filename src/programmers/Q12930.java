package programmers;

public class Q12930 { // 이상한 문자 만들기
    public static class Solution {
        public String solution(String s) {
            String answer = "";
            String[] str = s.split("");
            int index= 0;
            for(int i = 0;i<str.length;i++){
                if(!str[i].equals(" ")) {
                    str[i] = index % 2 == 0 ? str[i].toUpperCase() : str[i].toLowerCase();
                    index++;
                }else{
                    index=0;
                }
                answer+=str[i];
            }
            return answer;
        }
    }
}
