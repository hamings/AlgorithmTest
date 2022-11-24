package programmers;

import java.util.*;

public class Q68644 { // 두 개 뽑아서 더하기
    public static class Solution {
        public int[] solution(int[] numbers) {
            HashSet<Integer> hashSet = new HashSet<>();
            for(int i = 0;i<numbers.length;i++){
                for(int j = 0;j<i;j++){
                    hashSet.add(numbers[i]+numbers[j]);
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
            Collections.sort(arrayList);
            int[] answer = new int[arrayList.size()];
            for(int i = 0;i<arrayList.size();i++){
                answer[i] = arrayList.get(i);
            }
            return answer;
        }
    }
}
