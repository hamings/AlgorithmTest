package programmers;

import java.util.ArrayList;

public class Q86051 { // 없는 숫자 더하기
    public static class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i : numbers){
                arrayList.add(i);
            }
            for(int i = 0;i<10;i++){
                if(!arrayList.contains(i)){
                    answer+=i;
                }
            }

            return answer;
        }
    }
}
