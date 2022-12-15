package programmers;

import java.util.Arrays;

public class Q42747 { // H-Index
    public static class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);
            int answer = 0;
            for(int i = 0;i<citations.length;i++){
                int hIndex = citations.length-i;
                if(citations[i]>=hIndex){
                    answer=hIndex;
                    break;
                }
            }
            return answer;
        }
    }

}
