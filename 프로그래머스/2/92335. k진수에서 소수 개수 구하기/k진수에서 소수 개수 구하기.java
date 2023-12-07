import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
            StringBuilder sb = new StringBuilder();
            while(n>k){
                sb.append(n%k);
                n/=k;
            }
            sb.append(n);
            String[] strings = sb.reverse().toString().split("0{1,}");
            for(String s : strings){
                long num = Long.parseLong(s);
                if(num==1) continue;
                int count = 0;
                for(int i = 2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        count++;
                        break;
                    }
                }
                if(count==0) {
                    answer++;
                }
            }
            return answer;
    }
}