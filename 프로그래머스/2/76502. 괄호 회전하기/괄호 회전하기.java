import java.util.*;
class Solution {
        public int solution(String s){
            int answer = 0;
            char[] str = s.toCharArray();
            for(int i = 0;i<str.length;i++){
                if(isCorrect(str,i)){
                    answer++;
                }
            }
            return answer;
        
        }
        public boolean isCorrect(char[] str, int offset){
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i< str.length;i++){
                char c = str[(offset+i)% str.length];
                if(c=='['||c=='('||c=='{'){
                    stack.add(c);
                }else{
                    if(stack.isEmpty()) return false;
                    char ch = stack.peek();
                    switch (c){
                        case ']': if(ch=='[') stack.pop();break;
                        case ')': if(ch=='(') stack.pop();break;
                        case '}': if(ch=='{') stack.pop();break;
                    }
                }
            }return stack.empty();
    }
}