package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Q42748 { // K번째 수
    public static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for(int i = 0;i<commands.length;i++){
                ArrayList<Integer> arrayList = new ArrayList<>();
                for(int j = commands[i][0]-1;j<commands[i][1];j++){
                    arrayList.add(array[j]);
                }
                Collections.sort(arrayList);
                answer[i]=arrayList.get(commands[i][2]-1);
            }
            return answer;
        }
    }

}
