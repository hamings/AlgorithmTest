package programmers;

import java.util.ArrayList;

public class Q142086 { // 가장 가까운 같은 글자
    public static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            String[] strings = s.split("");
            for(int i = 0;i<strings.length;i++){
                int num=-1;
                for(int j = i-1;j>=0;j--){
                    if(strings[i].equals(strings[j])){
                        num=i-j;
                        break;
                    }
                }answer[i]=num;

            }
            return answer;
        }
    }
}
