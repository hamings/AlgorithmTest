package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Q68935 { // 3진법 뒤집기
    public static class Solution {
        public int solution(int n) {
            int answer = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            while(n!=0){
                arrayList.add(n%3);
                n/=3;
            }
            Collections.reverse(arrayList);
            for(int i = 0;i<arrayList.size();i++){
                answer+=arrayList.get(i)*Math.pow(3,i);
            }

            return answer;
        }
    }
}
