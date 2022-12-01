package programmers;

import java.util.Stack;

public class Q12909 { // 올바른 괄호
    public static class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='('){
                    stack.push(ch);
                }
                if(ch==')'){
                    if(stack.size()==0){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                return true;
            }else {
                return false;
            }
        }
    }

}
