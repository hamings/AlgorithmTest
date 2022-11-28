package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Q12910 { // 나누어 떨어지는 숫자 배열
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int a : arr){
                if(a%divisor==0){
                    arrayList.add(a);
                }
            }

            if (arrayList.size() != 0) {
                answer = new int[arrayList.size()];
                Collections.sort(arrayList);
                for(int i = 0;i<arrayList.size();i++){
                    answer[i] = arrayList.get(i);
                }
            }else answer = new int[]{-1};


            return answer;
        }
    }
}
