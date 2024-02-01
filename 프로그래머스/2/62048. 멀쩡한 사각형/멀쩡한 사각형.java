import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        double inc = (double)w/(double)h;
        for(long i = h-1;i>0;i--){
            answer+=Math.floor(i*inc);
        }
        
        return answer*2;
    }
}