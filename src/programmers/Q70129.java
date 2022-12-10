package programmers;

public class Q70129 { // 이진 변환 반복하기
    public static class Solution {
        public int[] solution(String s) {

            int zeroCount = 0;
            int num = 0;

            while(s.length()!=1){
                int length = 0;
                for(String a : s.split("")){
                    if(a.equals("0")){
                        zeroCount++;
                    }else{
                        length++;
                    }
                }

                s=Integer.toBinaryString(length);
                num++;
            }


            int[] answer = {num,zeroCount};
            return answer;
        }
    }
}
