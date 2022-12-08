package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Q12933 { // 정수 내림차순으로 배치하기
    public static class Solution {
        public long solution(long n) {
            String[] strings = String.valueOf(n).split("");
            StringBuilder sb = new StringBuilder();
            Arrays.sort(strings,Collections.reverseOrder());
            for(String a : strings){
                sb.append(a);
            }
            long answer =Long.parseLong(String.valueOf(sb));
            return answer;
        }
    }
}
