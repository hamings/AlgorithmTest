package programmers;

import java.util.ArrayList;

public class Q12981 { // 영어 끝말잇기
    public static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            int index = 0;
            ArrayList<String> arrayList = new ArrayList<>();
            for(int i = 0;i<words.length;i++){
                if(arrayList.size()!=0&&arrayList.contains(words[i])) {
                    index = i;
                    break;
                }
                if(i<words.length-1&&words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)){
                    index=i+1;
                    break;
                }
                arrayList.add(words[i]);
            }

            answer[0]=index==0?0:index%n+1;
            answer[1]=index==0?0:index/n+1;

            return answer;
        }
    }

}
