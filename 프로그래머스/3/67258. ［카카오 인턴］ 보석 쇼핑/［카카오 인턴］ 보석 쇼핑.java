import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        int start = 0;
            int end = gems.length-1;
            
            Set<String> set = new HashSet<>(List.of(gems));
            int s = 0;
            int e = s;
            Map<String, Integer> map = new HashMap<>();
        map.put(gems[s],1);
            while(s< gems.length){
                if(map.keySet().size()==set.size()){
                    if(e-s<end-start){
                        start=s;
                        end =e;
                    }
                    map.put(gems[s],map.get(gems[s])-1);
                    if(map.get(gems[s])==0){
                        map.remove(gems[s]);
                    }
                    s++;
                }else if(e<gems.length-1){
                    e++;
                    map.put(gems[e], map.getOrDefault(gems[e],0)+1);
                }else {
                    break;
                }
            }
            return new int[]{start+1,end+1};
    }
}