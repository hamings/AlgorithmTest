package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Q12917 { //문자열 내림차순으로 배치하기
    public static class Solution {
        public String solution(String s) {
            String answer = "";
            String[] strs = s.split("");
            Arrays.sort(strs, Collections.reverseOrder());
            answer=String.join("",strs);
            return answer;
        }
    }

}
