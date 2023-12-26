import java.util.*;
class Solution {
    public int solution(int[] topping) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int i : topping) {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            Set<Integer> broHasTopping = new HashSet<>();
            int answer = 0;
            for(int i = 0;i<topping.length;i++){
                int toppingNum = topping[i];
                broHasTopping.add(toppingNum);
                map.put(toppingNum,map.get(toppingNum)-1);
                if(map.get(toppingNum)==0){
                    map.remove(toppingNum);
                }
                if(map.size()==broHasTopping.size()) answer++;
            }
            return answer;
        }
}