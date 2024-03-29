import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
         int answer = 0;
            Queue<Integer> queue = new LinkedList<>();

            int sum =0;
            for(int i=0;i<truck_weights.length;i++){
                int truck = truck_weights[i];
                while(true){
                    if(queue.isEmpty()){
                        queue.add(truck);
                        answer++;
                        sum+= truck;
                        break;
                    }else if(queue.size()==bridge_length){
                        sum-= queue.poll();

                    }else{
                        if(sum+truck<=weight){
                            queue.add(truck);
                            sum+=truck;
                            answer++;
                            break;
                        }else{
                            queue.add(0);
                            answer++;
                        }

                    }
                }
            }

            return answer+bridge_length;
            
       
    }
}