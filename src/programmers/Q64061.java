package programmers;

import java.util.Stack;

public class Q64061 { // 크레인 인형뽑기 게임
    public static class Solution {
        public int solution(int[][] board, int[] moves) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int i = 0;i<moves.length;i++){
                for(int j = 0;j<board.length;j++){
                    if(board[j][moves[i]-1]!=0){
                        if(stack.size()!=0&&stack.peek().equals(board[j][moves[i]-1])){
                            board[j][moves[i]-1]=0;
                            stack.pop();
                            answer+=2;
                            break;
                        }else {
                            stack.push(board[j][moves[i]-1]);
                            board[j][moves[i]-1]=0;
                            break;
                        }
                    }
                }

            }

            return answer;
        }
    }
}
