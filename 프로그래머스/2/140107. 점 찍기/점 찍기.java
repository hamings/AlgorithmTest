import java.util.*;
class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        // for(int x = 0;x<=d;x+=k){
        //     for(int y=0;y<=d;y+=k){
        //         long x1 = (long)x*x;
        //         long y1 = (long)y*y;
        //         if(Math.sqrt(x1+y1)<=d){
        //             answer++;
        //         }else{
        //             break;
        //         }
        //     }
        // }
        for(int x = 0;x<=d;x+=k){
            long d1 = (long)d*d;
            long x1 = (long)x*x;
            int count = (int)Math.sqrt(d1-x1)/k;
            answer+=count;
        }
        return answer+(d/k)+1;
    }
}