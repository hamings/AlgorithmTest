import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
            int index = 1;
            Stack<Integer> stack = new Stack<>();
            for (int num : order) {
                while(index<num){
                    stack.add(index++);
                }
                if(index==num){
                    answer++;
                    index++;
                    continue;
                }
                if(stack.peek()==num){
                    stack.pop();
                    answer++;
                    continue;
                }
                break;
            }
            return answer;
    }
}