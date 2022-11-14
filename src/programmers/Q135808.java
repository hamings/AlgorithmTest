package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Q135808 { // 과일 장수
    public static class Solution {
        public int solution(int k, int m, int[] score) {
            int boxNum = score.length/m;
            int index = m-1;
            int answer = 0;
            Integer[] temp = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(temp,Collections.reverseOrder());
            for(int i=0;i<boxNum;i++){
                answer+= temp[index]*m;
                index+=m;
            }
            return answer;
        }
    }
}
