import java.util.*;
class Solution {
    private static final String[][] precedences = {
                "+-*".split(""),
                "+*-".split(""),
                "-+*".split(""),
                "-*+".split(""),
                "*+-".split(""),
                "*-+".split(""),
    };

        private long calculate(long left, long right, String op) {
            if(op.equals("+")){
                return left+right;
            }
            else if (op.equals("*")) {
                return left*right;
            }else if(op.equals("-")){
                return left-right;
            }else{
                return 0;
        }
        }
        private long calculate(List<String> token, String[] precedence){
            for(String op : precedence){
                for(int i = 0;i<token.size();i++){
                    if(token.get(i).equals(op)){
                        long left = Long.parseLong(token.get(i-1));
                        long right = Long.parseLong(token.get(i+1));
                        long result = calculate(left,right,op);
                        token.remove(i-1);
                        token.remove(i-1);
                        token.remove(i-1);
                        token.add(i-1,String.valueOf(result));
                        i-=2;
                    }
                }
            }
            return Long.parseLong(token.get(0));
        }
        public long solution(String expression){
            StringTokenizer st = new StringTokenizer(expression,"+-*",true);
            List<String> tokens = new ArrayList<>();
            while(st.hasMoreTokens()){
                tokens.add(st.nextToken());
            }
            long max = Long.MIN_VALUE;
            for(String[] precedence: precedences){
                long value = Math.abs(calculate(new ArrayList<>(tokens),precedence));
                max = Math.max(max,value);
            }
            return max;
}
}