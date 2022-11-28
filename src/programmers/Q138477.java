package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Q138477 { // 명예의 전당(1)
    public static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0;i<score.length;i++){
                arrayList.add(score[i]);
                Collections.sort(arrayList,Collections.reverseOrder());
                answer[i]=i<k? arrayList.get(i) : arrayList.get(k-1);
                }
            return answer;
        }
    }
}
