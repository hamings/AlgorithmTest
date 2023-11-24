import java.util.*;
class Solution {
    public static final PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        public static final PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a,b) -> b-a);
        public int[] solution(String[] operation){
            
            for(String s : operation){
                if(s.equals("D 1")){
                    if(maxQueue.isEmpty()) continue;
                    removeMax();
                } else if (s.equals("D -1")) {
                    if (minQueue.isEmpty()) continue;
                    removeMin();
                }else{
                    int num = Integer.parseInt(s.replace("I ",""));
                    add(num);
                }
            }
            if(maxQueue.isEmpty()){
                return new int[]{0, 0};
            }
            return new int[]{maxQueue.poll(),minQueue.poll()};
        }
        public void add(int num){
            minQueue.add(num);
            maxQueue.add(num);
        }
        public void removeMax(){
            minQueue.remove(maxQueue.poll());
        }
        public void removeMin(){
            maxQueue.remove(minQueue.poll());
        }
    }
