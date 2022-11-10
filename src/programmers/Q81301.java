package programmers;

public class Q81301 { //숫자 문자열과 영단어
    public static class Solution {
        public int solution(String s) {
            String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            for(int i = 0;i<nums.length;i++){
                s = s.replace(nums[i],Integer.toString(i));
            }
            int answer = Integer.parseInt(s);
            return answer;
        }
    }
}
