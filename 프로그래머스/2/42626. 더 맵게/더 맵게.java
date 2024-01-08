import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
            int answer = 0;
            for (int i : scoville) {
                priorityQueue.add(i);
            }

            while(priorityQueue.size()>=2){
                if(check(priorityQueue,K)) break;
                int first = priorityQueue.poll();
                int second = priorityQueue.poll();
                int scovileIndex = calScovileIndex(first,second);
                priorityQueue.add(scovileIndex);
                answer++;
            }
         if(priorityQueue.peek()<K) return -1; 


            return answer;
        }
        private int calScovileIndex(int first, int second){
            return first+(second*2);
        }
        private boolean check(PriorityQueue<Integer> priorityQueue, int k){
            for (Integer i : priorityQueue) {
                if(i<k) return false;
            }
            return true;
        }
}