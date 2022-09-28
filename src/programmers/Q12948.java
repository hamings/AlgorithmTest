package programmers;

public class Q12948 {
    public static class Solution {
        public String solution(String phone_number) {
            String answer = "";
            char[] ch = phone_number.toCharArray();
            for(int i = 0; i<ch.length;i++){
                if(i<ch.length-4){
                    answer+='*';
                }else{
                    answer+=ch[i];
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("01033334444"));
        System.out.println(sol.solution("02777888"));

    }
}
