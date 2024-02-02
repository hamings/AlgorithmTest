import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Queue<String> queue = new LinkedList<>();
        Map<String,String> map = new HashMap<>();
        for(String s : record){
            String[] strings = s.split(" ");
            String status = strings[0];
            String id = strings[1];
            queue.add(status);
            queue.add(id);
            
            if(status.equals("Leave")) continue;
            String name = strings[2];
            map.put(id,name);
        }
        List<String> list = new ArrayList<>();
        while(!queue.isEmpty()){
            String status = queue.poll();
            String id = queue.poll();
            String name = map.get(id);
            if(status.equals("Enter")){
                list.add(name+"님이 들어왔습니다.");
                continue;
            }
            if(status.equals("Leave")){
                list.add(name+"님이 나갔습니다.");
            }
        }
        return list.stream().toArray(String[]::new);
    }
}