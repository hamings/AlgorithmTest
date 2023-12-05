import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for(int i = 1;i<numbers.length;i++){
            if(numbers[stack.peek()]>=numbers[i]){
                stack.add(i);
                continue;
            }
            while(!stack.isEmpty()&&numbers[stack.peek()]<numbers[i]){
                int index = stack.pop();
                answer[index]=numbers[i];
            }
            stack.add(i);
            
        }
        while(!stack.isEmpty()){
            int index = stack.pop();
            answer[index] = -1;
        }
        return answer;
    }
}