package programmers;

public class Q12980 { // 점프와 순간 이동
       public static class Solution {
        public int solution(int n) {
            int ans = 0;
            while(n!=1){
                if(n%2!=0){
                    ans++;
                }
                n=n/2;
            }
            return ans+1;
        }
    }
}
