package programmers;

import java.util.Arrays;

public class Q12935 { // 제일 작은 수 제거하기
    public static class Solution {
        public int[] solution(int[] arr) {
            int[] temp = arr.clone();
            int[] answer = {};
            Arrays.sort(temp);
            if(temp.length==1){
                answer = new int[]{-1};
            }else{
                answer = new int[arr.length-1];
                int index = 0;
                for(int i = 0;i<arr.length;i++){
                    if(arr[i]!=temp[0]){
                        answer[index++]=arr[i];
                    }
                }
            }return answer;
        }
    }
}
