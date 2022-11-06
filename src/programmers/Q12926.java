package programmers;

public class Q12926 { //시저 암호
    public static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            char[] ch = s.toCharArray();
            for(int i = 0;i<ch.length;i++){
                if(ch[i]>=65&&ch[i]<=90){
                    ch[i]+=n;
                    if(ch[i]>90){
                        ch[i]-=26;
                    }
                }else if(ch[i]>=97&&ch[i]<=122){
                    ch[i]+=n;
                    if(ch[i]>122){
                        ch[i]-=26;
                    }
                }
            }answer =String.valueOf(ch);
            return answer;
        }
    }

}
