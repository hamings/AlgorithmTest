package programmers;

public class Q12953 { // N개의 최소공배수
    public static class Solution {
        public int solution(int[] arr) {
            int answer = arr[0];
            for (int i = 0; i < arr.length; i++) {
                answer = answer * arr[i] / gcd(answer, arr[i]);
            }
            return answer;
        }

        static int gcd(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    }
}
