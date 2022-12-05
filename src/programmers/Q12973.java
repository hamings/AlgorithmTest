package programmers;

import java.util.Stack;

public class Q12973 { // 짝지어 제거하기
    public static class Solution {
        public int solution(String s) {
            Stack<String> stack = new Stack<>();
            String[] strings = s.split("");
            for(String a : strings){
                if(stack.size()!=0&&stack.peek().equals(a)){
                    stack.pop();
                    continue;
                }
                stack.add(a);
            }

            int answer = stack.empty()? 1 :0 ;

            return answer;
        }
    }
}
