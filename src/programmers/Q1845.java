package programmers;

import java.util.HashSet;
import java.util.Set;

public class Q1845 { // 폰켓몬
    public static class Solution {
        public int solution(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int a : nums){
                set.add(a);
            }
            int answer = Math.min(set.size(), nums.length / 2);
            return answer;
        }
    }
}
