package programmers;

import java.util.HashMap;
import java.util.Map;

public class Q42576 { // 완주하지 못한 선수
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> members = new HashMap<>();
        for(String p : participant){
            members.put(p,members.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            if(members.containsKey(c)){
                members.put(c,members.get(c)-1);
            }
        }
        for(String m : members.keySet()){
            if(members.get(m)!=0){
                answer = m;
            }

        }return answer;
    }
}
