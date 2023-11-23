import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
            for(int i = 0;i<progresses.length;i++){
                queue.add(i);
            }
            List<Integer> list = new ArrayList<>();
            int days = 0;
            int count=0;
            while(!queue.isEmpty()){
                int index = queue.poll();
                int expiration = (int)Math.ceil((double)(100-progresses[index])/speeds[index]);
                if(expiration>days){
                    if(days!=0){
                        list.add(count);
                        count=0;
                    }
                    days=expiration;
                    
                }
                count++;
            }
        list.add(count);
            return list.stream().mapToInt(Integer::intValue).toArray();
    }
}