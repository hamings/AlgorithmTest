package programmers;

public class Q132267 { //콜라문제
    public static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            while(n>=a){
                answer+=(n/a)*b;
                n=(n/a)*b+(n%a);
            }
            return answer;
        }
    }

}
