import java.util.*;
class Solution {
    public int solution(int n, int k , int[] enemy){
            int answer = 0;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for(int i = 0;i<enemy.length;i++){
                if(k>0){
                    priorityQueue.add(enemy[i]);
                    k--;
                }else{
                    int num = enemy[i];
                    if(priorityQueue.peek()<enemy[i]){
                        num = priorityQueue.poll();;
                        priorityQueue.add(enemy[i]);
                    }
                    if(n>=num){
                        n-=num;
                    }else{
                        break;
                    }
                }
                answer++;
            }
            return answer;
        }
}