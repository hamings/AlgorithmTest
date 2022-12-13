package programmers;

import java.util.stream.Stream;

public class Q12939 { // 최댓값과 최솟값
    public static class Solution {
        public String solution(String s) {
            String[] strings = s.split(" ");
            Integer[] arrays = Stream.of(strings).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            int max =arrays[0];
            int min =arrays[0];
            for(int i = 0;i< arrays.length-1;i++){
                max = Math.max(max,arrays[i+1]);
                min = Math.min(min,arrays[i+1]);
            }

            String answer = min+" "+max;

            return answer;
        }
    }

}
