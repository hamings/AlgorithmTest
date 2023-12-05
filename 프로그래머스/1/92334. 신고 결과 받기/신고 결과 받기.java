import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        ArrayList<String> arrayList = new ArrayList<>();
            for(String s : id_list){
                arrayList.add(s);
            }
            boolean[][] isSendMail = new boolean[id_list.length][id_list.length];
            int[] answer = new int[id_list.length];

            for(String s : report){
                String[] spilt = s.split(" ");
                int col = arrayList.indexOf(spilt[0]);
                int row = arrayList.indexOf(spilt[1]);
                isSendMail[col][row] = true;
            }
            for(int i = 0;i<isSendMail.length;i++){
                for(int j = 0;j< isSendMail.length;j++){
                    if(!isSendMail[i][j]) continue;
                    int count = 0;
                    for(int n = 0;n<isSendMail.length;n++){
                        if(isSendMail[n][j]) count++;
                    }
                    if(count>=k) answer[i]++;
                }
            }
            return answer;
    }
}