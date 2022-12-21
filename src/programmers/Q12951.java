package programmers;


public class Q12951 { // JadenCase 문자열 만들기
    public static class Solution {
        public String solution(String s) {
            String answer = "";
            boolean flag = true;
            char[] chars = s.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(flag){
                    chars[i]=Character.toUpperCase(chars[i]);
                    flag = false;
                }else{
                    chars[i]=Character.toLowerCase(chars[i]);
                }
                if(chars[i]==' '){
                    flag = true;
                }
            }
            answer+=String.valueOf(chars);

            return answer;
        }
    }

}
