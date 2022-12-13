package programmers;

import java.util.*;

public class Q64065 { // 튜플
    public static class Solution {
        public int[] solution(String s) {
            s = s.replaceAll("[{}]","");
            String[] strings = s.split(",");
            HashMap<Integer,Integer> map = new HashMap<>();

            for(String str : strings){
                if(!map.isEmpty()&&map.containsKey(Integer.parseInt(str))) {
                    int count = map.get(Integer.parseInt(str));
                    count++;
                    map.put((Integer.parseInt(str)), count);
                }else{
                    map.put(Integer.parseInt(str),1);
                }
            }

            List<Integer> keySetList = new ArrayList<>(map.keySet());
            Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

            int[] answer = new int[keySetList.size()];

            for(int i = 0;i<keySetList.size();i++){
                answer[i]=keySetList.get(i);
            }
            return answer;

        }
    }
}
