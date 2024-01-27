import java.util.Stack;
class Solution {
    public String solution(int n) {
        final int NUMBERSIZE=3;
            int length = 0;
            int sum = 0;
            Stack<Integer> stack = new Stack<>();
            while(n>sum){
                length++;
                int number = (int)Math.pow(NUMBERSIZE,length);
                sum+=number;
                stack.add(number);
            }
            sum-=stack.pop();

            n-=sum;
            StringBuilder sb = new StringBuilder();
            while(!stack.empty()){
                int num = stack.pop();
                int quot = (int)Math.ceil((double)n/num);
                if(quot==0 ||quot==3){
                    sb.append(4);
                }else{
                    sb.append(quot);
                }
                n%=num;
            }
            if(n==0||n==3) {
                sb.append(4);
            }else{
                sb.append(n);
            }
            return sb.toString();
    }
}
