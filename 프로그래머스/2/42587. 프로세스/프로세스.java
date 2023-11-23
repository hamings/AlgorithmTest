import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
            for(int i = 0;i<priorities.length;i++){
                queue.add(i);
            }
            int[] copy = Arrays.copyOf(priorities,priorities.length);
            Integer[] copyInteger = Arrays.stream(copy).boxed().toArray(Integer[]::new);
            Arrays.sort(copyInteger, Collections.reverseOrder());
            int result = 0;
            int count = 0;
            while(!queue.isEmpty()){
                int index = queue.poll();
                if(priorities[index]==copyInteger[count]){
                    result++;
                    count++;
                    if(index == location) break;
                }else{
                    queue.add(index);
                }
            }
            return result;
    }
}