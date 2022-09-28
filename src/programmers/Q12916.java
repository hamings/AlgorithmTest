package programmers;

public class Q12916 {//문자열 내 p와 y의 개수
    public static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int pCount = 0;
            int yCount = 0;
            char[] ch = s.toCharArray();
            if(s.length()<=50){
                for(int i = 0; i<s.length();i++){
                    if(ch[i]=='p'||ch[i]=='P'){
                        pCount++;
                    }else if(ch[i]=='y'||ch[i]=='Y'){
                        yCount++;
                    }
                }
                if(pCount!=yCount){
                    answer = false;;
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("pPoooyY" ));
        System.out.println(sol.solution("Pyy" ));
    }
}
