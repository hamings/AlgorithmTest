import java.util.*;
class Solution {
    static StringBuilder stringBuilder = new StringBuilder();
        public String solution(String p) {
            dp(p);
            return stringBuilder.toString();
        }

        private class Split {
            private final String u;
            private final String v;

            public Split(String u, String v) {
                this.u = u;
                this.v = v;
            }


        }

        private Split splitString(String p) {
            Stack<Character> stack = new Stack<>();
            char[] chars = p.toCharArray();
            stack.add(chars[0]);
            int index = 0;
            for (int i = 1; i < chars.length; i++) {
                if (stack.peek() != chars[i]) {
                    stack.pop();
                    if (stack.empty()) {
                        index = i;
                        break;
                    }
                } else {
                    stack.add(chars[i]);
                }
            }
            return new Split(p.substring(0, index+1), p.substring(index+1));
        }

        private boolean isCorrectString(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            if (chars[0] == ')') return false;
            stack.add(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (stack.peek() == chars[i]) {
                    stack.add(chars[i]);
                    continue;
                }
                stack.pop();
            }
            return stack.empty();
        }
        private void dp(String string){
            if(string.isEmpty()) return;
            Split split = splitString(string);
    

            if(isCorrectString(split.u)){
                stringBuilder.append(split.u);
                dp(split.v);
            }else{
                stringBuilder.append("(");
                dp(split.v);
                stringBuilder.append(")");
                stringBuilder.append(reverseUString(split.u));
            }
        }
        private String reverseUString(String u){
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<u.length()-1;i++){
                if(u.charAt(i)==')'){
                    sb.append("(");
                }else{
                    sb.append(")");
                }
            }
            return sb.toString();
        }
}